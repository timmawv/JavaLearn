package avlyakulov.timur.epam.chapter_4.owl.controller;

import avlyakulov.timur.epam.chapter_4.owl.entity.Owl;
import avlyakulov.timur.epam.chapter_4.owl.entity.Sparrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OwlController {

    Sparrow bird;

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

    public boolean checkBird() {
        if (bird == null) {
            System.out.println("You dont create a bird");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a bird press 1");
        System.out.println("if you want to fly a car press 2");
        System.out.println("if you want to sing your car press 3");
        System.out.println("if you want to carry the eggs your wheel press 4");
        System.out.println("if you want to hatch the chicks press 5");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createBird(reader);
            case "2" -> {
                if (checkBird()) bird.fly();
            }
            case "3" -> {
                if (checkBird()) bird.sing();
            }
            case "4" -> {
                if (checkBird()) bird.carryEggs();
            }
            case "5" -> {
                if (checkBird()) bird.hatchTheChicks();
            }
        }
        runNavigation();
    }

    public void createBird(BufferedReader reader) {
        try {
            System.out.println("What do you want to create sparrow/owl");
            String answer = reader.readLine();
            if (answer.equals("sparrow")) {
                System.out.print("Creating a sparrow... \n" + "Enter the name of bird - ");
                String name = reader.readLine();
                bird = new Sparrow(name);
            } else {
                System.out.print("Creating a owl... \n" + "Enter the name of bird - ");
                String name = reader.readLine();
                bird = new Owl(name);
            }
        } catch (IOException e) {
            System.out.println("your problem is " + e.getMessage());
        }

    }
}
