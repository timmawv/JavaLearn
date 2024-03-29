package avlyakulov.timur.epam.chapter_5.city.controller;

import avlyakulov.timur.epam.chapter_5.city.entity.City;
import avlyakulov.timur.epam.chapter_5.city.entity.TypeOfDistrict;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
            case "2" -> {
                if (isCityCreated())
                    addToCityDistrict(reader);
            }
            case "3" -> {
                if (isCityCreated())
                    System.out.println("Population of city " + city.getName()  + " is " + city.getPopulation());
            }
            case "4" -> {
                if (isCityCreated())
                    System.out.println(city);
            }
            case "5" -> {
                if (isCityCreated())
                    printInformationAboutSpecificDistrict(reader);
            }
            case "6" -> {
                if (isCityCreated()) {
                    if (city.isCapital())
                        System.out.println("Yes your city is the capital");
                    else System.out.println("No your is not a capital");
                }
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
    public void addToCityDistrict (BufferedReader reader) {
        try {
            System.out.println("Choose type of district");
            System.out.println(Arrays.toString(TypeOfDistrict.values()).toLowerCase());
            System.out.println("Enter the type of your district ");
            String typeDistrict = reader.readLine().toUpperCase();
            TypeOfDistrict typeOfDistrict = TypeOfDistrict.valueOf(typeDistrict);
            System.out.println("Enter the name of district ");
            String nameOfDistrict = reader.readLine();
            City.CityDistrict cityDistrict = city. new CityDistrict(typeDistrict,nameOfDistrict);
            city.addToCityDistrict(cityDistrict);
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void printInformationAboutSpecificDistrict (BufferedReader reader) {
        try {
            System.out.println("Enter the number of district that you want to get information ");
            System.out.println(Arrays.toString(city.getCityDistricts()));
            int num = Integer.parseInt(reader.readLine());
            City.CityDistrict[] cityDistricts = city.getCityDistricts();
            System.out.println(cityDistricts[num - 1]);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}
