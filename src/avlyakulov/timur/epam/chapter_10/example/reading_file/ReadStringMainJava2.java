package avlyakulov.timur.epam.chapter_10.example.reading_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStringMainJava2 {
    //чтение строк из файла
    public static void main(String[] args) {
        String stringLines = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("data\\res.txt"))) {
            String tmp;
            while ((tmp = reader.readLine()) != null) { //java 2
                stringLines = stringLines.concat(tmp +"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringLines);
    }
}