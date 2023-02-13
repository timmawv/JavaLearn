package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Подсчитать, сколько раз заданное слово входит в текст.
 */
public class CountWordInText {
    public static void main(String[] args) {
        String text = "Наше слово Было его важное слово! Которое есть, Важным слово в нашем тексте. Поэтому Мы его пишем Вот так. Ты кто спросил Он у Вас";
        String word = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите слово для того чтобы подсчитать его количество в тексте");
            word = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;
        while (matcher.find()) {
            ++counter;
        }
        System.out.println(counter);
    }
}