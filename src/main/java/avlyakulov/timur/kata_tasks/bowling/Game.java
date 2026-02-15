package avlyakulov.timur.kata_tasks.bowling;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Game {

    private AtomicInteger score = new AtomicInteger(0);
    private AtomicInteger currentNumberScore = new AtomicInteger(0);
    private AtomicInteger numberRound = new AtomicInteger(1);
    private AtomicBoolean isTryFinished = new AtomicBoolean(false);
    private AtomicInteger numberTry = new AtomicInteger(1);
    private AtomicInteger maximumRounds = new AtomicInteger(10);
    private AtomicBoolean isSpare = new AtomicBoolean(false);
    private AtomicBoolean isStrike = new AtomicBoolean(false);
    private final static Integer NUMBER_PINS = 10;


    public void game() {
        while (!(numberRound.get() == NUMBER_PINS)) {
            System.out.println("Round number " + numberRound + "started");
            System.out.println("Your general score before this round is " + score());
            roundStart();
            numberRound.incrementAndGet();
        }
    }

    @SneakyThrows
    public void roundStart() {
        String answerStr;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your score this round: ");
            while ((answerStr = reader.readLine()) != null) {
                int points = Integer.parseInt(answerStr);
                while (Boolean.FALSE.equals(isTryFinished.get()))
                    roll(points);
                currentNumberScore.set(0);
            }
        }
    }

    public void roll(int points) {
        System.out.println("You have score this number this round " + points);
        if (isSpare.get()) {
            points = points + points;
            currentNumberScore.addAndGet(points);
            score.addAndGet(currentNumberScore.get());
            isSpare.set(false);
            return;
        }

        if (isStrike.get()) {

        }


    }

    public Integer score() {
        return score.get();
    }
}
