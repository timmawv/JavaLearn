package avlyakulov.timur.epam.chapter_6.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Candy;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Chocolate;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Iris;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Lollipop;
import avlyakulov.timur.epam.chapter_6.sweet.impl.ProductionOfSweetImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProductionController {
    ProductionOfSweetImpl productionOfSweet;

    public boolean checkCreateProduction() {
        if (productionOfSweet == null) {
            System.out.println("You don't create a production of sweet");
            return false;
        } else return true;
    }

    public void run() {
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

    public void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1" -> {
                if (checkCreateProduction())
                    System.out.println("You have created the production");
                else productionOfSweet = new ProductionOfSweetImpl();
            }
            case "2" -> {
                if (!checkCreateProduction())
                    System.out.println("You don't create a production");
                else releaseBatchOfCandy(reader);
            }
            case "3" -> {
                if (!checkCreateProduction())
                    System.out.println("You don't create a production");
            }
            case "4" -> {
                if (!checkCreateProduction())
                    System.out.println("You don't create a production");
            }
            case "5" -> {
                if (!checkCreateProduction())
                    System.out.println("You don't create a production");
            }
            case "6" -> {
                if (!checkCreateProduction())
                    System.out.println("You don't create a production");
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
            int i = 0;
            Candy candy;
            Candy[] candies = new Candy[0];
            System.out.println("Enter the name of candy that you want to add to batch");
            String name = reader.readLine();
            System.out.println(Arrays.toString(ProducerOfSweets.values()));
            System.out.println("Enter his producer from this list");
            String producer = reader.readLine();
            switch (name) {
                case "Candy" -> candy = new Candy(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "Lollipop" -> candy = new Lollipop(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "Iris" -> candy = new Iris(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                case "Chocolate" -> candy = new Chocolate(ProducerOfSweets.valueOf(producer.toUpperCase()), name);
                default -> throw new IllegalStateException("Unexpected value: " + name);
            }
            candies[i] = candy;
            Candy[] candies1 = new Candy[candies.length + 1];
            System.arraycopy(candies, 0, candies1, 0, candies.length);
            candies = candies1;
            ++i;
            productionOfSweet.releaseBatchOfCandy(candies);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }
}
