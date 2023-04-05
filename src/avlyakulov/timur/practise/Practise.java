package avlyakulov.timur.practise;

import java.util.ArrayList;
import java.util.List;

public class Practise {

    public static void printOurAnimals(List<? super Dog> animals) {
        animals.add(new Dog());
        System.out.println(animals);
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        dogs.add(new Dog());
        cats.add(new Cat());
        List<Animal> animals = new ArrayList<>(List.of(new Animal(), new Cat(), new Dog()));
        System.out.println("Animals");
        printOurAnimals(animals);
        System.out.println("Cats");
        printOurAnimals(cats);
        System.out.println("Dogs");
        printOurAnimals(dogs);
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return "Animal";
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}

class Dog extends Cat {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}