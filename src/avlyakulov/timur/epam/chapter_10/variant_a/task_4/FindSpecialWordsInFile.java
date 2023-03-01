package avlyakulov.timur.epam.chapter_10.variant_a.task_4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
Найти и вывести слова текста, для которых последняя буква одного слова
совпадает с первой буквой следующего слова.
 */
public class FindSpecialWordsInFile {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_4\\info.txt");
        String line;
        try (Scanner sc = new Scanner(new FileReader(file))) {
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] words = line.split("\\s");
                for (int i = 0; i < words.length - 1; ++i) {
                    if (words[i].toLowerCase().charAt(words[i].length() - 1) == words[i + 1].toLowerCase().charAt(0))
                        System.out.println("Слова текста, для которых последняя буква одного слова совпадает с первой буквой следующего слова\n" +
                                words[i] + " и " + words[i + 1]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}