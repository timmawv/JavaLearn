package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

import java.util.Arrays;

public class Iris extends Candy {
    public Iris (ProducerOfSweets producer, String name) {
        super(producer, name);
        ingredients = new Ingredient[] {Ingredient.SUGAR,Ingredient.COCOA,Ingredient.MILK,Ingredient.SALT};
    }

    @Override
    public String toString() {
        return "Iris{" +
                "ingredients=" + Arrays.toString(ingredients) +
                "} " + super.toString();
    }
}