package avlyakulov.timur.practise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    private String name;
    private int id;
    private static int current;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

    public static void main(String[] args) {
        Person person = new Person(1, "John");
        Person person1 = new Person(2, "Nick");
        Person person2 = new Person(3, "Dave");
        Person[] persons = new Person[3];
        persons[0] = person;
        persons[1] = person1;
        persons[2] = person2;
        System.out.println(Arrays.toString(persons));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Загрузки\\testFile.txt"))) {
            oos.writeObject(persons);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}