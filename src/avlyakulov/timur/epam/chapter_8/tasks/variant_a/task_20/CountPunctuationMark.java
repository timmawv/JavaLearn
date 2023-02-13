package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Подсчитать количество содержащихся в данном тексте знаков препинания.
 */
public class CountPunctuationMark {
    public static void main(String[] args) {
        String text = "Наше слово! Было важное слово, которое - есть важным слово, в нашем: тексте";
        Pattern pattern = Pattern.compile("[!,-:]");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find())
            ++counter;
        System.out.println("Количество знаков препинания " +counter);
    }
}