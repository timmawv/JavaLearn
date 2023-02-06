package avlyakulov.timur.epam.chapter_8.example.variant_a.task_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
После каждого слова текста, заканчивающегося заданной подстрокой, вста-
вить указанное слово.
 */
public class InsertStringAfterSubString {
    public static void main(String[] args) {
        String text = "Наше слово было важное слово, которое есть важным слово в нашем тексте";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("введите слово которое хотитет вставить");
            String word = reader.readLine();
            System.out.println("введите слово после которого хотите встаить ваше слово");
            String subString = reader.readLine();
            text = text.replaceAll(subString, subString + " " + word);
            System.out.println(text);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}