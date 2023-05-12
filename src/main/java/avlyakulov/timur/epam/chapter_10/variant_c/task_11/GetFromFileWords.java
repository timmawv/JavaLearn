package avlyakulov.timur.epam.chapter_10.variant_c.task_11;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Из текстового файла ввести последовательность строк. Выделить отдель-
ные слова, разделяемые пробелами. Написать метод поиска слова по образ-
цу-шаблону. Вывести найденное слово в другой файл.
 */
public class GetFromFileWords {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_11\\text.txt");
        File newFile = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_11\\newFile.txt");
        String text = "";
        try (Scanner reader = new Scanner(new FileReader(file))) {
            while (reader.hasNextLine()) {
                text = text.concat(reader.nextLine() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        System.out.println("Введите шаблон для поиска слов в строке");
        String regex = new Scanner(System.in).nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.print("Нашли слова которые соответствуют шаблону - ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            while (matcher.find()) {
                System.out.print(matcher.group() + ", ");
                writer.write(matcher.group() + ", ");
            }
        } catch (IOException e) {
            throw new RuntimeException("Exception", e);
        }
        System.out.println();
        System.out.println(text);
    }
}