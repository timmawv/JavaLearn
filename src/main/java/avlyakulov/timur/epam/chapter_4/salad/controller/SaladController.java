package avlyakulov.timur.epam.chapter_4.salad.controller;

import avlyakulov.timur.epam.chapter_4.salad.entity.Cucumber;
import avlyakulov.timur.epam.chapter_4.salad.entity.Onion;
import avlyakulov.timur.epam.chapter_4.salad.entity.Salad;
import avlyakulov.timur.epam.chapter_4.salad.entity.Tomato;

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

    public boolean checkSalad() {
        if (salad == null) {
            System.out.println("You dont create a salad");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a salad  press 1");
        System.out.println("if you want to add to salad a vegetable press 2");
        System.out.println("if you want to count and get weight of salad and calories press 3");
        System.out.println("if you want to look out at all salad press 4");
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
                if (checkSalad()) addToSaladVegetable(reader);
            }
            case "3" -> {
                if (checkSalad()) salad.countWeightAndCalories();
                System.out.println("Weight of salad " + salad.getWeight());
                System.out.println("Calories of salad " + salad.getCalories());
            }
            case "4" -> System.out.println(salad);
            default -> System.out.println("You enter wrong number. Try again");
        }
        runNavigation();
    }

    public void addToSaladVegetable (BufferedReader reader)  {
        try {
            System.out.println("Choose vegetable that you want to add to salad ");
            printVegetables();
            String answer = reader.readLine().toLowerCase();
            switch (answer) {
                case "onion" -> {
                    System.out.println("Adding to salad Onion ");
                    Onion onion = new Onion(100,200);
                    salad.addToSaladVegetable(onion);
                }
                case "cucumber" -> {
                    System.out.println("Adding to salad Cucumber ");
                    Cucumber cucumber = new Cucumber(150,150);
                    salad.addToSaladVegetable(cucumber);
                }
                case "tomato" -> {
                    System.out.println("Adding to salad Tomato ");
                    Tomato tomato = new Tomato(300,100);
                    salad.addToSaladVegetable(tomato);
                }
                default -> System.out.println("You enter wrong name of vegetable");
            }
        }
        catch (NumberFormatException | IOException e) {
            System.out.println("You enter wrong format " + e.getMessage());
        }
    }

    public void printVegetables () {
        System.out.println("Onion\n" + "Tomato\n" + "Cucumber");
    }
}