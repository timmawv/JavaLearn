package avlyakulov.timur.epam.chapter_10.example.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationMain {
    public static void main(String[] args) {
        //Student.faculty = "ITM";
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("data\\o.dat"))) {
            Student student = (Student) ois.readObject();
            System.out.println(student);
            System.out.println(student.getFaculty());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}