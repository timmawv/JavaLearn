package avlyakulov.timur.epam.chapter_5.shop.controller;

import avlyakulov.timur.epam.chapter_5.shop.entity.Shop;
import avlyakulov.timur.epam.chapter_5.shop.entity.TypeOfDepartment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShopController {
    Shop shop;
    Shop.DepartmentInTheStore check;

    public boolean isShopCreated() {
        if (shop == null) {
            System.out.println("You don't create a shop!");
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
                else
                    crud(position, reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (shop != null)
                    System.out.println("You have created shop");
                else createShop(reader);
            }
            case "2" -> {
                if (isShopCreated())
                    makePurchaseShop(reader);
            }
            case "3" -> {
                if (isShopCreated())
                    System.out.println(check);
            }
            case "4" -> {
                if (isShopCreated())
                    System.out.println(shop);
            }
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create shop press 1");
        System.out.println("If you want to buy something in shop press 2");
        System.out.println("If you want to check your check press 3");
        System.out.println("If you want to print all yours checks for the shopping press 4");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void createShop(BufferedReader reader) {
        try {
            System.out.println("Enter the name of shop");
            String nameShop = reader.readLine();
            System.out.println("Enter the address of shop");
            String addressShop = reader.readLine();
            shop = new Shop(nameShop, addressShop);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }

    public void makePurchaseShop(BufferedReader reader) {
        try {
            System.out.println("Choose department where you want to go ");
            System.out.println(Arrays.toString(TypeOfDepartment.values()));
            System.out.println("Enter the name of department that you choose");
            String nameOfDepartment = reader.readLine();
            TypeOfDepartment typeOfDepartment = TypeOfDepartment.valueOf(nameOfDepartment.toUpperCase());
            check = shop.new DepartmentInTheStore(typeOfDepartment);
            System.out.println("Please choose in this department what product do you want to buy");
            System.out.println(Arrays.toString(check.getProducts()));
            String nameOfProduct = reader.readLine();
            check.addToBasketAndToCheckProduct(nameOfProduct);
            shop.addToCheckHistoryNewCheck(check);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}