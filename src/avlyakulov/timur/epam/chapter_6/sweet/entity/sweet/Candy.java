package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

public abstract class Candy {
    private ProducerOfSweets producer;
    private Ingredient[] ingredients;

    public Candy (ProducerOfSweets producer) {
        this.producer = producer;
        ingredients = new Ingredient[]{Ingredient.COCOA,Ingredient.SUGAR,Ingredient.SALT};
    }
}