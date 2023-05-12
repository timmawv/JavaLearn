package avlyakulov.timur.epam.chapter_4.planet.controller;

import avlyakulov.timur.epam.chapter_4.planet.entity.Planet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetController {
    private Planet planet;

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

    public boolean checkPlanet() {
        if (planet == null) {
            System.out.println("You dont create a planet");
            return false;
        } else return true;
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("if you want to create a planet press 1");
        System.out.println("if you want to get name of planet press 2");
        System.out.println("if you want to print mainlands press 3");
        System.out.println("if you want to get number of mainlands press 4");
        System.out.println("if you want to add mainland press 5");
        System.out.println("if you want finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createPlanet(reader);
            case "2" -> {
                if (checkPlanet()) System.out.println("Your name of planet is " + planet.getName());
            }
            case "3" -> {
                if (checkPlanet()) planet.printMainlands();
            }
            case "4" -> {
                if (checkPlanet()) System.out.println("Number of mainlands is " + planet.getCounter());
            }
            case "5" -> {
                if (checkPlanet()) addMainland(reader);
            }
        }
        runNavigation();
    }

    public void createPlanet(BufferedReader reader) {
        try {
            System.out.println("Enter the name of planet");
            String name = reader.readLine();
            planet = new Planet(name);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addMainland (BufferedReader reader) {
        try {
            System.out.println("Enter the name of mainland");
            String name = reader.readLine();
            planet.addMainland(name);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}