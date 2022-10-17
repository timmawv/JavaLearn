package avlyakulov.timur.epam.chapter_4.salad.controller;

import avlyakulov.timur.epam.chapter_4.salad.entity.Salad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaladController {
    Salad salad;

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

    public boolean checkTrain() {
        if (salad == null) {
            System.out.println("You dont create a train");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a salad  press 1");
        System.out.println("if you want to add to train carriage  press 2");
        System.out.println("if you want to add to look all train press 3");
        System.out.println("if you want to get summary number of passengers and weight of train press press 4");
        System.out.println("if you want to sort train by level of comfort press press 5");
        System.out.println("if you want to get carriages from your diapason press press 6");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (salad == null) {
                    System.out.println("Creating a salad...");
                    salad = new Salad();
                } else
                    System.out.println("You have created salad");

            }
            case "2" -> {
                if (checkTrain()) addToTrainCarriage(reader);
            }
            case "3" -> {
                if (checkTrain()) System.out.println(train);
            }
            case "4" -> {
                if (checkTrain()) getNumberOfPassengersAndWeight();
            }
            case "5" -> {
                if (checkTrain()) train.sortByLevelComfort();
            }
            case "6" -> {
                if (checkTrain()) printCarriagesFromDiapason(reader);
            }
            default -> System.out.println("You enter wrong number. Try again");
        }
        runNavigation();
    }
}