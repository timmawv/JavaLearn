package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Определить сумму всех целых чисел, встречающихся в заданном тексте.
 */
public class FindIntegerNumberInText {
    public static void main(String[] args) {
        String text = "Наше слово! Было 1 важное слово, 5.5 которое - есть 6 важным 5.7575 слово, в нашем:  78 тексте 9";
        Pattern pattern = Pattern.compile("\\d*[.0-9]+");
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find()) {
            try {
                sum += Integer.parseInt(matcher.group());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(sum);
    }
}