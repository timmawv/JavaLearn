package avlyakulov.timur.epam.chapter_6.home.controller;

import avlyakulov.timur.epam.chapter_6.home.BaseHouse;
import avlyakulov.timur.epam.chapter_6.home.impl.BaseHouseImpl;
import avlyakulov.timur.epam.chapter_6.home.impl.OfficeHouseImpl;
import avlyakulov.timur.epam.chapter_6.home.impl.ShoppingCenterHouseImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HouseController {
    BaseHouse baseHouse;

    public boolean checkHouseCreate() {
        return baseHouse != null;
    }

    public void run() {
        String position;
        runNavigation();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (checkHouseCreate())
                    System.out.println("You have created House");
                else createHouse(reader);
            }
            case "2" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else System.out.println("Your price of square is " + baseHouse.countPriceForSquareMeter());
            }
            case "3" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else System.out.println("Your number of rooms is " + baseHouse.getNumberOfRooms());
            }
            case "4" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else increaseSquare(reader);
            }
            case "5" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else baseHouse.rentHouse();
            }
            case "6" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else baseHouse.makeRepair();
            }
            case "7" -> {
                if (!checkHouseCreate())
                    System.out.println("You don't create a house");
                else System.out.println(baseHouse);
            }
            default -> System.out.println("You enter the wrong value!");
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to build your house press 1 ");
        System.out.println("If you want to count price of square of your house press 2 ");
        System.out.println("If you want to get number of rooms house press 3 ");
        System.out.println("If you want to increase square of your house press 4 ");
        System.out.println("If you want to rent your house press 5 ");
        System.out.println("If you want to make repair your house press 6 ");
        System.out.println("If you want to print all information about your building press 7");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void createHouse(BufferedReader reader) {
        try {
            System.out.println("Choose type of House that you want to create ");
            System.out.println("1. House");
            System.out.println("2. Office");
            System.out.println("3. Shopping center");
            int type = Integer.parseInt(reader.readLine());
            System.out.println("Enter the square of your building ");
            int square = Integer.parseInt(reader.readLine());
            System.out.println("Enter number of rooms ");
            int numberOfRooms = Integer.parseInt(reader.readLine());
            System.out.println("Enter the floor of the house ");
            int floorOfTheHouse = Integer.parseInt(reader.readLine());
            switch (type) {
                case 1 -> baseHouse = new BaseHouseImpl(square, numberOfRooms, floorOfTheHouse);
                case 2 -> baseHouse = new OfficeHouseImpl(square, numberOfRooms, floorOfTheHouse);
                case 3 -> baseHouse = new ShoppingCenterHouseImpl(square, numberOfRooms, floorOfTheHouse);
            }
            baseHouse.buildHouse();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void increaseSquare (BufferedReader reader) {
        try {
            System.out.println("Your old square is " + baseHouse.getSquare());
            System.out.println("Enter the new square ");
            int square = Integer.parseInt(reader.readLine());
            baseHouse.increaseSquare(square);
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}