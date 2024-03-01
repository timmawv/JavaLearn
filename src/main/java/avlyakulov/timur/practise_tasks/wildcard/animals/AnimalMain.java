package avlyakulov.timur.practise_tasks.wildcard.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Horse());
        animals.add(new Fish());
        animals.add(new Whale());
        System.out.println(animals);
        System.out.println(new AnimalsFilter().filterAnimals(animals));
    }
}
