package avlyakulov.timur.epam.chapter_4.puppy.controller;

import avlyakulov.timur.epam.chapter_4.puppy.entity.Dog;
import avlyakulov.timur.epam.chapter_4.puppy.entity.Puppy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuppyController {
    Dog animal;

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

    public boolean checkPuppy() {
        if (animal == null) {
            System.out.println("You dont create puppy");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a puppy press 1");
        System.out.println("if you want to get name of puppy press 2");
        System.out.println("if you want to bark puppy press 3");
        System.out.println("if you want to run puppy press 4");
        System.out.println("if you want to bite puppy press 5");
        System.out.println("if you want to jump puppy press 6");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createPuppy(reader);
            case "2" -> {
                if (checkPuppy()) animal.printName();
            }
            case "3" -> {
                if (checkPuppy()) animal.barking();
            }
            case "4" -> {
                if (checkPuppy()) animal.running();
            }
            case "5" -> {
                if (checkPuppy()) animal.biting();
            }
            case "6" -> {
                if (checkPuppy()) animal.jumping();
            }
        }
        runNavigation();
    }

    public void createPuppy(BufferedReader reader) {
        try {
            System.out.println("Choose what you want to create dog/puppy");
            String answer = reader.readLine();
            if (answer.equals("puppy")) {
                System.out.println("Enter the name of puppy");
                String name = reader.readLine();
                animal = new Puppy(name);
            }
            else {
                System.out.println("Enter the name of dog");
                String name = reader.readLine();
                animal = new Dog(name);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
