package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

import java.util.Arrays;

public class Lollipop extends Candy{
    public Lollipop (ProducerOfSweets producer,String name) {
        super(producer,name);
        ingredients = new Ingredient[] {Ingredient.SUGAR,Ingredient.COCOA};
    }

    @Override
    public String toString() {
        return "Lollipop{" +
                "ingredients=" + Arrays.toString(ingredients) +
                "} " + super.toString();
    }
}
