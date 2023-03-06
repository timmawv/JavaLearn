package avlyakulov.timur.epam.chapter_10.variant_c.task_7;
/*
Из файла удалить все слова, содержащие от трех до пяти символов, но при
этом из каждой строки должно быть удалено только максимальное четное
количество таких слов.
 */


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteFromFileWords {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_7\\text.txt");
        try (Scanner readerFile = new Scanner(new FileReader(file))) {
            while (readerFile.hasNextLine()) {
                int counter = 0;
                String line = readerFile.nextLine();
                System.out.println(line);
                Pattern pattern = Pattern.compile("\\b\\w{3,5}\\b");
                Matcher matcher = pattern.matcher(line);
                while (matcher.find())
                    ++counter;
                System.out.println(counter);
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
    }
}