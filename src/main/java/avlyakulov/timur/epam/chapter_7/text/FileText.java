package avlyakulov.timur.epam.chapter_7.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.*;

/*
Вывести количество вхождений заданного слова в тексте соответственно
из файла в виде [слово1-2, слово2-3, слово3-0].
 */
public class FileText {
    public static void main(String[] args) {
        String textStr = new String();
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_7\\text\\fileText2.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                textStr += sc.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the word than you want to check match");
            String word = reader.readLine();
            Function<String, String[]> splitText = s -> s.split("[^A-Za-zА-Яа-я0-9]");
            String[] text = splitText.apply(textStr);
            System.out.println(Arrays.toString(text));
            Predicate<String> checkWordEntry = (s) -> s.equals(word);
            long numberOfEntry = Arrays.stream(text).filter(checkWordEntry).count();
            System.out.println(word + "-" + numberOfEntry);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value ");
        }
    }
}
