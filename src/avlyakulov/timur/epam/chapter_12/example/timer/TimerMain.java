package avlyakulov.timur.epam.chapter_12.example.timer;

import java.util.Timer;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerCounter(), 100, 3000);
        try {
            Thread.sleep(10_000);
            timer.cancel();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        timer.purge(); // очищает все прерваные задачи

    }
}
