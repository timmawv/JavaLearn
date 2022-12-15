package avlyakulov.timur.epam.chapter_6.sweet.entity.sweet;

import avlyakulov.timur.epam.chapter_6.sweet.entity.Ingredient;
import avlyakulov.timur.epam.chapter_6.sweet.entity.ProducerOfSweets;

import java.util.Arrays;

public class Candy {
    private String name;
    Ingredient[] ingredients;
    private ProducerOfSweets producer;


    public Candy(ProducerOfSweets producer,String name) {
        this.producer = producer;
        this.name = name;
    }

    public void addNewIngredients(Ingredient ingredient) {
        Ingredient[] ingredients1 = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, ingredients1, 0, ingredients.length);
        ingredients = ingredients1;
        ingredients[ingredients.length - 1] = ingredient;

    }

    public void setIngredients (Ingredient[] ingredients1) {
        this.ingredients = ingredients1;
    }

    public ProducerOfSweets getProducer() {
        return producer;
    }

    public void setProducer(ProducerOfSweets producer) {
        this.producer = producer;
    }
    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return  "{Name='" + name + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", producer=" + producer +
                '}';
    }
}