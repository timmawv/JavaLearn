package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
В каждом слове текста k-ю букву заменить заданным символом. Если
k больше длины слова, корректировку не выполнять.
 */
public class ChangeLetter {
    public static void main(String[] args) {
        String text = "    Наш  набор слов        в     котором будут  меняться буквы    в зависимости от значения    ";
        text = text.strip();
        text = text.replaceAll("\\s+", " ");
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        int numberToChange = 0;
        char letter = ' ';
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите номер буквы в котором");
            numberToChange = Integer.parseInt(reader.readLine());
            System.out.println("Введите символ которым хотите заменить заданую строку");
            letter = reader.readLine().charAt(0);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
        int i = 0;
        System.out.println(Arrays.toString(words));
        for (String w : words) {
            char[] wordChar = w.toCharArray();
            if (!w.matches("[А-Яа-я]{" + numberToChange  + ",}")) {
                ++i;
                continue;
            } else {
                wordChar[numberToChange - 1] = letter;
            }
            words[i] = String.valueOf(wordChar);
            ++i;
        }
        System.out.println(Arrays.toString(words));
    }
}