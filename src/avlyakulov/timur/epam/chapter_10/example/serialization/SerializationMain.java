package avlyakulov.timur.epam.chapter_10.example.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data\\o.dat"))) {
            Student student = new Student("Janka",555777,"VKL_1410");
            System.out.println(student);
            oos.writeObject(student);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
