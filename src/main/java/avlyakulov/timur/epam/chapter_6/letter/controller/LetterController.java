package avlyakulov.timur.epam.chapter_6.letter.controller;

import avlyakulov.timur.epam.chapter_6.letter.entity.AbstractLetter;
import avlyakulov.timur.epam.chapter_6.letter.entity.Letter;
import avlyakulov.timur.epam.chapter_6.letter.entity.OrderLetter;
import avlyakulov.timur.epam.chapter_6.letter.entity.PostAction;
import avlyakulov.timur.epam.chapter_6.letter.impl.LetterAction;
import avlyakulov.timur.epam.chapter_6.letter.impl.OrderLetterAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LetterController {

    PostAction<Letter> letterPostAction = new LetterAction();
    OrderLetterAction orderLetterPostAction = new OrderLetterAction();
    AbstractLetter[] letters = new AbstractLetter[1];
    int counter = 0;


    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String position;
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0")) {
                    System.exit(0);
                } else {
                    crud(position, reader);
                }
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createAndSendLetter(reader);
            case "2" -> addSender(reader);
            case "3" -> deleteSender(reader);
            case "4" -> changeCostOfLetter(reader);
            case "5" -> System.out.println(Arrays.toString(letters));

        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create and send letter press 1");
        System.out.println("If you want to add sender to your letter or change it press 2");
        System.out.println("If you want to delete sender press 3");
        System.out.println("If you want to change cost of your order letter press 4");
        System.out.println("If you want to print all letters press 5");
        System.out.println();
    }

    public void createAndSendLetter(BufferedReader reader) {
        try {
            if (counter == letters.length) {
                AbstractLetter[] letters1 = new AbstractLetter[letters.length + 1];
                System.arraycopy(letters, 0, letters1, 0, letters.length);
                letters = letters1;
            }
            System.out.println("Enter type of letter that you want to send 1/2 ");
            System.out.println("1)Letter");
            System.out.println("2)Order Letter");
            int type = Integer.parseInt(reader.readLine());
            System.out.println("Enter sender ");
            String sender = reader.readLine();
            System.out.println("Enter the text of letter");
            String text = reader.readLine();
            switch (type) {
                case 1 -> {
                    Letter letter = new Letter(sender, text);
                    letters[counter] = letter;
                }
                case 2 -> {
                    System.out.println("Enter the cost of email");
                    int cost = Integer.parseInt(reader.readLine());
                    OrderLetter letter = new OrderLetter(sender, text, cost);
                    letters[counter] = letter;
                }
            }
            ++counter;

        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void addSender(BufferedReader reader) {
        try {
            System.out.println("Enter the new sender ");
            String sender = reader.readLine();
            System.out.println(Arrays.toString(letters));
            System.out.println("From this list choose letter where you want to change sender ");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            if (letters[num] instanceof Letter)
                letterPostAction.addSender((Letter) letters[num], sender);
            else
                orderLetterPostAction.addSender((OrderLetter) letters[num], sender);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void deleteSender(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(letters));
            System.out.println("From this list choose letter where you want to delete sender ");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            if (letters[num] instanceof Letter)
                letterPostAction.deleteSender((Letter) letters[num]);
            else
                orderLetterPostAction.deleteSender((OrderLetter) letters[num]);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void changeCostOfLetter(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(letters));
            System.out.println("From this list choose order letter where you want to change cost");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            System.out.println("Enter the new cost of email");
            int cost = Integer.parseInt(reader.readLine());
            orderLetterPostAction.changeCost((OrderLetter) letters[num], cost);
        } catch (IOException | IllegalArgumentException | ClassCastException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }
}
