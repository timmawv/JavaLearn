package avlyakulov.timur.projects.gallow;

import avlyakulov.timur.projects.gallow.model.GallowsModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Gallows {
    private int life;
    private GallowsModel gallowsModel = new GallowsModel();
    private List<String> usedWords = new ArrayList<>();


    public void startGame(BufferedReader reader) throws IOException {
        life = 5;
        usedWords.clear();
        String hiddenWord = new Dictionary().chooseRandWord();
        char[] word = new char[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); ++i) {
            word[i] = '_';
        }
        while (life > 0) {
            gallowsModel.gallowsState(life);
            System.out.println("Used words " + usedWords);
            System.out.print("Hidden word ");
            for (int i = 0; i < word.length; ++i)
                System.out.print(word[i] + " ");
            System.out.println();
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
                        word[i] = letter.charAt(0);
                }
            } else --life;
            if (!String.valueOf(word).contains("_")) {
                System.out.println("\u001B[32mYou win this game\u001B[0m");

                System.out.println("\n\n\n\n\n");
                break;
            } else if (life == 0) {
                System.out.println("\u001B[31mYou lost\u001B[0m");
                gallowsModel.gallowsState(life);
                System.out.print("Hidden word ");
                for (int i = 0; i < word.length; ++i)
                    System.out.print(word[i] + " ");
                System.out.println();
                System.out.println("Used words " + usedWords);
                System.out.println("\n\n\n\n\n");
                break;
            }
        }
    }

    public void mainMenu() {
        String state = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!state.equals("0")) {
                System.out.println("Do you want to start game?\nYes - д\nExit - н");
                state = reader.readLine();
                switch (state) {
                    case "д" -> startGame(reader);
                    case "н" -> System.exit(0);
                    default -> System.out.println("You have entered the wrong answer try again");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}