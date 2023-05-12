package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

import java.util.Arrays;

public class Chocolate extends Candy{
    public Chocolate (ProducerOfSweets producer,String name) {
        super(producer,name);
        ingredients = new Ingredient[] {Ingredient.MILK,Ingredient.COCOA,Ingredient.SUGAR};
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "ingredients=" + Arrays.toString(ingredients) +
                "} " + super.toString();
    }
}
