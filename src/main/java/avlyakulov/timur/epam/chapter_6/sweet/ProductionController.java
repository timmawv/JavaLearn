package avlyakulov.timur.epam.chapter_6.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;
import avlyakulov.timur.epam.chapter_6.sweet.impl.ProductionOfSweetImpl;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProductionController {
    ProductionOfSweetImpl productionOfSweet;
    int counterOfProduction = 0;
    Candy[] candies = new Candy[2];

    public boolean checkCreateProduction() {
        if (productionOfSweet == null) {
            System.out.println("You don't create a production of sweet");
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
                else crud(position, reader);
                runNavigation();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (productionOfSweet == null)
                    productionOfSweet = new ProductionOfSweetImpl();
                else System.out.println("You have created the production");
            }
            case "2" -> {
                if (checkCreateProduction())
                    releaseBatchOfCandy(reader);
            }
            case "3" -> {
                if (checkCreateProduction())
                    getInformationAboutSpecificProducer(reader);
            }
            case "4" -> {
                if (checkCreateProduction())
                    createNewTypeOfSweet(reader);
            }
            case "5" -> {
                if (checkCreateProduction())
                    System.out.println(productionOfSweet);

            }
            case "6" -> {
                if (checkCreateProduction())
                    withDrawCandyFromProduction(reader);

            }
        }
    }

    public void runNavigation() {
        System.out.println();
        System.out.println("If you want to create production press 1");
        System.out.println("If you want to add candies and release production press 2");
        System.out.println("If you want to get information about specific Producer press 3");
        System.out.println("If you want to create new type of Sweet press 4");
        System.out.println("If you want to get information about production press 5");
        System.out.println("If you want to withdraw a candy from production press 6");
        System.out.println("If you want to finish program press 0");
        System.out.println();
    }


    public void releaseBatchOfCandy(BufferedReader reader) {
        try {
            Candy candy;
            System.out.println("Enter the name of candy that you want to add to batch");
            String name = reader.readLine();
            System.out.println(Arrays.toString(ProducerOfSweets.values()));
            System.out.println("Enter his producer from this list");
            String producer = reader.readLine();
            switch (name.toUpperCase()) {
                case "SWEET" -> candy = new Sweet(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "LOLLIPOP" -> candy = new Lollipop(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "IRIS" -> candy = new Iris(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "CHOCOLATE" -> candy = new Chocolate(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                default -> throw new IllegalStateException("Unexpected value: " + name);
            }
            candies[counterOfProduction] = candy;
            ++counterOfProduction;
            productionOfSweet.releaseBatchOfCandy(candies);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void getInformationAboutSpecificProducer(BufferedReader reader) {
        try {
            System.out.println(Arrays.toString(ProducerOfSweets.values()));
            System.out.println("Enter the name of Producer of sweets from this list ");
            ProducerOfSweets nameProducer = ProducerOfSweets.valueOf(reader.readLine().toUpperCase());
            productionOfSweet.getInformationAboutSpecificProducer(nameProducer);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void createNewTypeOfSweet(BufferedReader reader) {
        try {
            System.out.println("Enter the name of new type of Candy ");
            String name = reader.readLine();
            System.out.println(Arrays.toString(ProducerOfSweets.values()));
            System.out.println("From this list enter producer of sweets");
            ProducerOfSweets producerOfSweets = ProducerOfSweets.valueOf(reader.readLine().toUpperCase());
            System.out.println("Enter the number of ingredients ");
            int numOfIngredients = Integer.parseInt(reader.readLine());
            Ingredient[] ingredients = new Ingredient[numOfIngredients];
            for (int i = 0; i < numOfIngredients; ++i) {
                System.out.println(Arrays.toString(Ingredient.values()));
                System.out.println("From this list enter ingredient that you want to add to your new Candy");
                ingredients[i] = Ingredient.valueOf(reader.readLine().toUpperCase());
            }
            Candy candy = productionOfSweet.createNewTypeSweet(producerOfSweets, ingredients, name);
            System.out.println(candy);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }

    public void withDrawCandyFromProduction(BufferedReader reader) {
        try {
            System.out.println("Enter the candy name that you want to withdraw ");
            String nameCandy = reader.readLine();
            productionOfSweet.withdrawFromProduction(nameCandy);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }

    }
}