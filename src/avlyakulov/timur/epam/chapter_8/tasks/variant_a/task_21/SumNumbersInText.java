package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
В заданном тексте найти сумму всех встречающихся цифр.
 */
public class SumNumbersInText {
    public static void main(String[] args) {
        String text = "Наше слово! Было 1 важное слово, которое - есть 6 важным слово, в нашем:  78тексте";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find())
            sum += Integer.parseInt(matcher.group());
        System.out.println(sum);
    }
}