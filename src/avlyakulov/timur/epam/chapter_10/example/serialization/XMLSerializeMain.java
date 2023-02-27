package avlyakulov.timur.epam.chapter_10.example.serialization;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;

public class XMLSerializeMain {
    public static void main(String[] args) {
        System.out.println("Сериализация в xml file нашего объекта");
        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream("data\\serial.xml")))) {
            Student student = new Student("Janka", 555777, "VKL_1410");
            xmlEncoder.writeObject(student);
            xmlEncoder.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try(XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(
                new FileInputStream("data\\serial.xml")))) {
            Student student = (Student)xmlDecoder.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
