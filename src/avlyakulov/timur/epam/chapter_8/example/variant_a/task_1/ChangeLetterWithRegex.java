package avlyakulov.timur.epam.chapter_8.example.variant_a.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.
 */
public class ChangeLetterWithRegex {
    public static void main(String[] args) {
        String text = "Наш набор слов в котором будут меняться буквы в зависимости от значения";
        Pattern pattern = Pattern.compile("[а-яА-Я ]");
        Matcher matcher = pattern.matcher(text);
        int numberToChange = 0;
        char letter = ' ';
        char[] textChar = text.toCharArray();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите номер буквы в котором");
            numberToChange = Integer.parseInt(reader.readLine());
            System.out.println("Введите символ которым хотите заменить заданую строку");
            letter = reader.readLine().charAt(0);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
        while (matcher.find()) {
            if (matcher.start() == numberToChange)
                textChar[numberToChange - 1] = letter;
        }
        text = String.valueOf(textChar);
        System.out.println(text);
    }
}