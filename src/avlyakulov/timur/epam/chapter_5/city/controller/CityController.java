package avlyakulov.timur.epam.chapter_5.city.controller;

import avlyakulov.timur.epam.chapter_5.city.entity.City;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CityController {
    private City city;

    public boolean isCityCreated() {
        return city != null;
    }

    public void run() {
        String position;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(reader,position);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void crud (BufferedReader reader, String position) {
        switch (position) {
            case "1" -> {
                if (isCityCreated())
                    System.out.println("You have created city");
                else createCity(reader);
            }
        }
    }

    public void runNavigation () {
        System.out.println();
        System.out.println("If you want to create City press 1");
        System.out.println("If you want to add district to your city press 2");
        System.out.println("If you want to get population of your city press 3");
        System.out.println("If you want to print information about city press 4");
        System.out.println("If you want to print information about specific district press 5");
        System.out.println("If you want to check is your city is a capital press 6");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void createCity (BufferedReader reader) {
        try {
            System.out.println("Enter the name of city");
            String name = reader.readLine();
            System.out.println("Enter the population of city");
            int population = Integer.parseInt(reader.readLine());
            city = new City(name,population);
            System.out.println("The city was created");
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }

    }
}
