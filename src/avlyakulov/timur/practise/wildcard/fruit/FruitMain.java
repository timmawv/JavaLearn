package avlyakulov.timur.practise.wildcard.fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(50));
        Banana banana = new Banana(120);
        fruits.add(banana);
        fruits.add(new Orange(220));
        fruits.add(new Apple(70));
        long numberOfFruits = new FruitSort().sortFruitsByWeight(fruits);
        System.out.println(fruits);
        System.out.println("Number of fruits where weight more than 100 - " + numberOfFruits);
    }
}
