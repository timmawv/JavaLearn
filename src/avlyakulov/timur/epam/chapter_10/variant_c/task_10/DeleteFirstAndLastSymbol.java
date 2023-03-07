package avlyakulov.timur.epam.chapter_10.variant_c.task_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке.
 */
public class DeleteFirstAndLastSymbol {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_10\\text.txt");
        try (Scanner reader = new Scanner(new FileReader(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.split("\\s");
                String w = words[0];
                words[0] = words[words.length - 1];
                words[words.length - 1] = w;
                String text = "";
                for (String s : words)
                    text = text.concat(s + ' ');
                System.out.println(text);
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }
}