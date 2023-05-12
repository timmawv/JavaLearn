package avlyakulov.timur.epam.chapter_6.product.controller;

import avlyakulov.timur.epam.chapter_6.product.entity.AbstractProduct;
import avlyakulov.timur.epam.chapter_6.product.entity.Butter;
import avlyakulov.timur.epam.chapter_6.product.entity.Cheese;
import avlyakulov.timur.epam.chapter_6.product.entity.Milk;
import avlyakulov.timur.epam.chapter_6.product.impl.ButterAction;
import avlyakulov.timur.epam.chapter_6.product.impl.CheeseAction;
import avlyakulov.timur.epam.chapter_6.product.impl.MilkAction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProductController {
    AbstractProduct[] products = new AbstractProduct[1];
    ButterAction butterAction = new ButterAction();
    CheeseAction cheeseAction = new CheeseAction();
    MilkAction milkAction = new MilkAction();

    int id = 1;
    int counter = 0;

    public void run() {
        runNavigation();
        String position;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((position = reader.readLine()) != null) {
                if (position.equals("0"))
                    System.exit(0);
                else crud(position, reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create and add  product to shopping room press 1");
        System.out.println("If you want to change place hold of your product press 2");
        System.out.println("If you want to print all your products press 3");
        System.out.println("If you want to increase butter fat percent press 4");
        System.out.println("If you want to decrease a fat percent of your milk press 5");
        System.out.println("If you want to increase cost of cheese press 6");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> createProduct(reader);
            case "2" -> changePlaceProduct(reader);
            case "3" -> System.out.println(Arrays.toString(products));
            case "4" -> increaseForFatPercent(reader);
            case "5" -> decreaseFatPercent(reader);
            case "6" -> increaseCostOfCheese(reader);
        }
    }

    public void createProduct(BufferedReader reader) {
        if (counter == products.length) {
            AbstractProduct[] products1 = new AbstractProduct[products.length + 1];
            System.arraycopy(products, 0, products1, 0, products.length);
            products = products1;
        }
        try {
            System.out.println("Choose what you want to create");
            System.out.println("1.Butter 2.Milk 3.Cheese");
            int chooseProductNum = Integer.parseInt(reader.readLine());
            System.out.println("Enter the cost of your product ");
            int cost = Integer.parseInt(reader.readLine());
            System.out.println("Enter the fat percent of your product ");
            int fatPercent = Integer.parseInt(reader.readLine());
            switch (chooseProductNum) {
                case 1 -> {
                    Butter butter = new Butter(id, cost, fatPercent);
                    products[counter] = butter;
                }
                case 2 -> {
                    Milk milk = new Milk(id, cost, fatPercent);
                    products[counter] = milk;
                }
                case 3 -> {
                    Cheese cheese = new Cheese(id, cost, fatPercent);
                    products[counter] = cheese;
                }
                default -> System.out.println("You enter the wrong value");
            }
        } catch (IOException | IllegalArgumentException | ClassCastException e) {
            System.out.println("You enter the wrong value  " + e.getMessage());
        }
        ++counter;
        ++id;
    }

    public void changePlaceProduct(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(products));
            System.out.println("From this list choose product that you want to change place");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            milkAction.changePlaceHold(products[num]);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void increaseForFatPercent(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(products));
            System.out.println("From this list choose butter that you want to increase fat percent");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            butterAction.increaseForFatPercent((Butter) products[num]);
        } catch (IOException | IllegalArgumentException | ClassCastException e) {
            System.out.println("You have enter/pick the wrong value " + e.getMessage());
        }
    }

    public void decreaseFatPercent(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(products));
            System.out.println("From this list choose milk that you want to decrease fat percent");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            milkAction.decreaseFatPercent((Milk) products[num]);
        } catch (IOException | IllegalArgumentException | ClassCastException e) {
            System.out.println("You have enter/pick the wrong value " + e.getMessage());
        }
    }

    public void increaseCostOfCheese(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(products));
            System.out.println("From this list choose cheese that you want to increase cost");
            int num = Integer.parseInt(reader.readLine());
            num = num - 1;
            cheeseAction.increaseCostOfCheese((Cheese)products[num]);
        } catch (IOException | IllegalArgumentException | ClassCastException e) {
            System.out.println("You have enter/pick the wrong value " + e.getMessage());
        }

    }
}