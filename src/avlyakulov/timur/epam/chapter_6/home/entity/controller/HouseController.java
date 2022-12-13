package avlyakulov.timur.epam.chapter_6.home.entity.controller;

import avlyakulov.timur.epam.chapter_6.home.entity.BaseHouse;
import avlyakulov.timur.epam.chapter_6.home.entity.impl.BaseHouseImpl;
import avlyakulov.timur.epam.chapter_6.home.entity.impl.OfficeHouseImpl;
import avlyakulov.timur.epam.chapter_6.home.entity.impl.ShoppingCenterHouseImpl;

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
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                runNavigation();
                if (position.equals("0"))
                    System.exit(0);
                crud(position, reader);
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
                else {}
            }
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create your house press 1 ");
        System.out.println();
    }

    public void createHouse(BufferedReader reader) {
        try {
            System.out.println("Choose type of House that you want to create ");
            System.out.println("1. House");
            System.out.println("2. Office");
            System.out.println("3. Shopping center");
            int type = Integer.parseInt(reader.readLine());
            System.out.println("Enter the square of your house ");
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
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }
}