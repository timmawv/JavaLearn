package avlyakulov.timur.projects.gallow2_0;

import avlyakulov.timur.projects.gallow1_0.Dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GallowsGame {
    Scanner scanner = new Scanner(System.in);
    private String WIN_CONDITION = "WIN";
    private String LOSS_CONDITION = "LOSS";
    private String GAME_NOT_FINISHED = "GAME_NOT_FINISHED";

    public void gameLoop() {
        GallowsState gallowsState = new GallowsState();
        String hiddenWord = new Dictionary().chooseRandWord();
        List<String> usedWords = new ArrayList<>();
        char[] word = createHiddenWord(hiddenWord);
        String state;
        do {
            playerTurn(gallowsState,hiddenWord, word, usedWords);
            state = checkState(gallowsState.getLife(), word);
        } while (state.equals(GAME_NOT_FINISHED));
        checkGameCondition(gallowsState,state, gallowsState.getLife(), word, usedWords, hiddenWord);
    }

    public void playerTurn(GallowsState gallowsState,String hiddenWord, char[] word, List<String> usedWords) {
        gallowsState.printGallows(word, usedWords);
        word = insertLetter(gallowsState,usedWords, hiddenWord, word);
    }

    public String checkState(int life, char[] word) {
        if (life == 0)
            return LOSS_CONDITION;
       else if (!String.valueOf(word).contains("_")) {
            return WIN_CONDITION;
        } else {
            return GAME_NOT_FINISHED;
        }
    }

    public void checkGameCondition(GallowsState gallowsState,String state, int life, char[] word, List<String> usedWords, String hiddenWord) {
        if (state.equals(WIN_CONDITION)) {
            System.out.println("\u001B[32mYou win this game\u001B[0m");
            System.out.println("Number of mistakes " + (5 - life));
            gallowsState.printGallows(word, usedWords);
            System.out.println("\n\n\n\n\n");
        } else {
            System.out.println("\u001B[31mYou lost\u001B[0m");
            gallowsState.printGallows(word, usedWords);
            System.out.println("\033[34mThe hidden word is " + hiddenWord + "\033[0m");
            System.out.println("\n\n\n\n\n");
        }
    }

    public char[] insertLetter(GallowsState gallowsState,List<String> usedWords, String hiddenWord, char[] word) {
        System.out.println("Insert letter");
        String letter = scanner.nextLine();
        if (letter.length() > 1 || letter.length() < 0 || usedWords.contains(letter)) {
            System.out.println("You have entered than more one letter or you entered this letter");
        } else {
            usedWords.add(letter);
            if (hiddenWord.contains(letter)) {
                for (int i = 0; i < hiddenWord.length(); i++) {
                    if (letter.equals(String.valueOf(hiddenWord.charAt(i)))) {
                        word[i] = letter.charAt(0);
                    }
                }
            } else {
                gallowsState.decreaseLife();
            }
        }
        return word;
    }


    public char[] createHiddenWord(String hiddenWord) {
        char[] word = new char[hiddenWord.length()];
        for (int i = 0; i < hiddenWord.length(); ++i) {
            word[i] = '_';
        }
        return word;
    }

    public void mainMenu() {
        while (true) {
            System.out.println("Do you want to start game y/n?");
            String answer = scanner.nextLine();
            switch (answer) {
                case "y" -> gameLoop();
                case "n" -> {
                    return;
                }
                default -> System.out.println("You have entered the wrong value!");
            }
        }
    }
}