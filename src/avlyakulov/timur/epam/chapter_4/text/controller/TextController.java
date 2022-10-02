package avlyakulov.timur.epam.chapter_4.text.controller;

import avlyakulov.timur.epam.chapter_4.text.entity.Sentence;
import avlyakulov.timur.epam.chapter_4.text.entity.Text;
import avlyakulov.timur.epam.chapter_4.text.entity.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextController {
    Text text = new Text();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else {
                    crud(position, reader);
                }
            }
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }

    public void runNavigation() {
        System.out.println("if you want enter or add text press 1");
        System.out.println("if you want to print your text press 2");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> enterText(reader);
            case "2" -> printText();
        }
        runNavigation();
    }

    public void enterText(BufferedReader reader) {
        try {
            System.out.println("Please enter tittle of your text");
            String tittle = reader.readLine();
            System.out.println("How many words in sentence need to be");
            int amount = Integer.parseInt(reader.readLine());
            Sentence sentence = new Sentence();
            for (int i = 0; i < amount; ++i) {
                boolean check = false;
                String word = "";
                while (!check) {
                    System.out.println("Enter word");
                    word = reader.readLine();
                    if (word.contains(" "))
                        System.out.println("Your word contains more than 1 word, please enter one more");
                    else {
                        check = true;
                    }
                }
                Word word1 = new Word();
                word1.setWord(word);
                sentence.addWordToSentence(word1);
            }
            text.setTittle(tittle);
            text.addText(sentence);
        } catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }

    public void printText() {
        System.out.println("Tittle of your text - " + text.getTittle());
        System.out.println(text);
    }
}