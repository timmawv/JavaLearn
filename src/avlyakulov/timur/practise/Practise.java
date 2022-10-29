package avlyakulov.timur.practise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Practise {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Загрузки\\testFile.txt"))) {
            Person [] persons = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(persons));
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
