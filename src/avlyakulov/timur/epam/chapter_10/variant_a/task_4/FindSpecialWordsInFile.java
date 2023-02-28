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
        String word;
        String wordNext = "";
        try (Scanner sc = new Scanner(new FileReader(file))) {
            while (sc.hasNext("[а-яА-Я]{1,}")) {
                word = sc.next();
                if (sc.hasNext())
                    wordNext = sc.next();
                if (word.toLowerCase().charAt(word.length() - 1) == wordNext.toLowerCase().charAt(0)) {
                    System.out.println("Слова текста, для которых последняя буква одного слова совпадает с первой буквой следующего слова.");
                    System.out.println(word + " и " + wordNext);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}