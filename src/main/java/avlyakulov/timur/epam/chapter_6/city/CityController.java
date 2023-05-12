package avlyakulov.timur.epam.chapter_6.city;

import avlyakulov.timur.epam.chapter_6.city.impl.CityActionImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CityController {
    CityActionImpl city;

    public boolean isCityCreated() {
        if (city == null) {
            System.out.println("You didn't create the city");
            return false;
        } else return true;
    }


    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(reader, position);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void crud(BufferedReader reader, String position) {
        switch (position) {
            case "1" -> {
                if (city != null) {
                    System.out.println("You have created the city");
                } else createTheCity(reader);
            }
            case "2" -> {
                if (isCityCreated())
                    chooseNewMayor(reader);
            }
            case "3" -> {
                if (isCityCreated())
                    changeNumberOfPopulation(reader);
            }
            case "4" -> {
                if (isCityCreated())
                    editBudgetOfCity(reader);
            }
            case "5" -> {
                if (isCityCreated())
                    System.out.println(city);
            }
            default -> System.out.println("You have enter the wrong value");
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create the city press 1");
        System.out.println("If you want to choose new Mayor press 2");
        System.out.println("If you want to change number of population press 3");
        System.out.println("If you want to edit Budget of city press 4");
        System.out.println("If you want to print all information about city press 5");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void createTheCity(BufferedReader reader) {
        try {
            System.out.println("Enter name of your city");
            String name = reader.readLine();
            System.out.println("Enter country of your city");
            String country = reader.readLine();
            System.out.println("Enter the year of creation of your city");
            int yearOfCreation = Integer.parseInt(reader.readLine());
            System.out.println("Enter the population of your city");
            int population = Integer.parseInt(reader.readLine());
            System.out.println("Enter the square of your city");
            int square = Integer.parseInt(reader.readLine());
            System.out.println("Enter the budget of your city");
            int budget = Integer.parseInt(reader.readLine());
            System.out.println("Enter the language city");
            String language = reader.readLine();
            System.out.println("Enter the mayor of your city");
            String mayor = reader.readLine();
            city = new CityActionImpl(name, country, yearOfCreation, population, square, budget, language, mayor);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value" + e.getMessage());
        }
    }

    public void chooseNewMayor(BufferedReader reader) {
        try {
            System.out.println("Enter the new mayor");
            String mayor = reader.readLine();
            city.chooseNewMayor(mayor);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value" + e.getMessage());
        }
    }

    public void changeNumberOfPopulation(BufferedReader reader) {
        try {
            System.out.println("If you want to increase your population press 1");
            System.out.println("If you want to decrease your population press 2");
            int checkNumInt = Integer.parseInt(reader.readLine());
            boolean checkNum;
            switch (checkNumInt) {
                case 1 -> checkNum = true;
                case 2 -> checkNum = false;
                default -> {
                    System.out.println("you have enter the wrong value");
                    return;
                }
            }
            System.out.println("Enter the number of population");
            int population = Integer.parseInt(reader.readLine());
            city.changeNumberOfPopulation(population, checkNum);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value" + e.getMessage());
        }
    }

    public void editBudgetOfCity(BufferedReader reader) {
        try {
            System.out.println("Enter the new budget");
            int budget = Integer.parseInt(reader.readLine());
            city.editBudgetOfCity(budget);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value" + e.getMessage());
        }
    }
}