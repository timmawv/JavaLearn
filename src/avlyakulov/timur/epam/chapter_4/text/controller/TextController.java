package avlyakulov.timur.epam.chapter_4.text.controller;

import avlyakulov.timur.epam.chapter_4.text.entity.Sentence;
import avlyakulov.timur.epam.chapter_4.text.entity.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextController {
    private Text text;

    public void run () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position,reader);

            }
        }
        catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }

    public void runNavigation() {
        System.out.println("if you want enter text press 1");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
            switch (position) {
                case "1" -> enterText(reader);
            }
            runNavigation();
        }

    public void enterText (BufferedReader reader) {
        try {
            System.out.println("How many words do you want enter");
            int amount = Integer.parseInt(reader.readLine());
            Sentence sentence = new Sentence();
            for (int i = 0; i < amount; ++i) {
                System.out.println("Enter word");
                String word = reader.readLine();
                sentence.getWords()[i].setWord(word);
            }
            System.out.println(sentence);
        }
        catch (IOException e) {
            System.out.println("problem " + e.getMessage());
        }
    }
}