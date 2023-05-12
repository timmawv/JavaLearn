package avlyakulov.timur.epam.chapter_6.sweet.impl;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProductionOfSweet;
import avlyakulov.timur.epam.chapter_6.sweet.entity.sweet.Candy;

import java.util.Arrays;

public class ProductionOfSweetImpl implements ProductionOfSweet {

    Candy[] production;

    @Override
    public void releaseBatchOfCandy(Candy[] candies) {
        production = candies;
    }

    @Override
    public void getInformationAboutSpecificProducer(ProducerOfSweets producerOfSweets) {
        System.out.println("Our producer " + producerOfSweets.toString());
        System.out.println("His candies in production");
        for (Candy candy : production)
            if (candy.getProducer().name().equals(producerOfSweets.name()))
                System.out.println(candy);
    }

    @Override
    public Candy createNewTypeSweet(ProducerOfSweets producer, Ingredient[] ingredients, String name) {
        Candy candy = new Candy(producer, name);
        candy.setIngredients(ingredients);
        return candy;
    }

    @Override
    public void getInformationAboutProduction() {
        System.out.println("Our productions is from these candies: ");
        for (Candy candy : production)
            System.out.println(candy);
    }

    @Override
    public void withdrawFromProduction(String nameCandy) {
        int counter = 0;
        for (Candy candy : production) {
            if (candy.getName().equals(nameCandy)) {
                production[counter] = null;
            }
            ++counter;
        }
        for (int i = counter; i < production.length; ++i) {
            Candy candy = production[counter];
            production[counter] = production[counter + 1];
            production[counter + 1] = candy;
        }
        Candy[] candies1 = new Candy[production.length - 1];
        System.arraycopy(production,0,candies1,0,candies1.length);
        production = candies1;
    }

    @Override
    public String toString() {
        return "ProductionOfSweetImpl{" +
                "production=" + Arrays.toString(production) +
                '}';
    }
}