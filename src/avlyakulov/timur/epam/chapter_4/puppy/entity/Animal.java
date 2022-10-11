package avlyakulov.timur.epam.chapter_4.puppy.entity;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("The name of animal is " + name);
    }
}
