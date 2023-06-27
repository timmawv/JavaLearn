package avlyakulov.timur.projects.gallow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Gallows {
    private int life;
    private List<String> usedWords = new ArrayList<>();

    public Gallows() {
        this.life = 5;
    }

    public void gallowsState() {
        switch (life) {
            case 5 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 4 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 3 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("  \t|\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 2 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("  \tO\t|");
                System.out.println("   _|_\t|");
                System.out.println("\t\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 1 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("   _O_\t|");
                System.out.println("   \t|\t|");
                System.out.println("   / \t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
            case 0 -> {
                System.out.println("\t----|");
                System.out.println("\t|\t|");
                System.out.println("   _O_\t|");
                System.out.println("   \t|\t|");
                System.out.println("   / \\\t|");
                System.out.println("  \t\t|");
                System.out.println("  \t\t|");
                System.out.println("\t-------");
            }
        }

    }

    public void startGame(BufferedReader reader) throws IOException {
        String hiddenWord = new Dictionary().chooseRandWord();
        char[] word = new char[2 * hiddenWord.length()];
        for (int i = 0; i < 2 * hiddenWord.length() - 1; i += 2) {
            word[i] = '_';
            word[i + 1] = ' ';
        }
        while (life > 0) {
            gallowsState();

            System.out.println("Used words " + usedWords);
            System.out.printf("Hidden word  %s\n", String.valueOf(word));
            String letter = "";
            boolean checkLetter = false;
            while (!checkLetter) {
                System.out.println("Enter the letter to guess the word");
                letter = reader.readLine();
                if (letter.length() > 1)
                    System.out.println("You have entered more than 1 letter");
                else {
                    if (usedWords.contains(letter)) {
                        System.out.println("This letter was used");
                    } else {
                        usedWords.add(letter);
                        checkLetter = true;
                    }
                }
            }
            if (hiddenWord.contains(letter)) {
                System.out.println("It contains this letter");
                for (int i = 0; i < hiddenWord.length(); ++i) {
                    if (hiddenWord.charAt(i) == letter.charAt(0))
                        word[2 * i] = letter.charAt(0);
                }
            } else --life;
        }
        gallowsState();
        System.out.println("You lose");
    }

    public void mainMenu() {
        String state;
        System.out.println("Do you want to start game?\nYes - y\nExit - n");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(state = reader.readLine()).equals("0")) {
                switch (state) {
                    case "y" -> startGame(reader);
                    case "n" -> System.exit(0);
                    default -> System.out.println("You have entered the wrong answer try again");
                }
                System.out.println("Do you want to start game?\nYes - y\nExit - n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}