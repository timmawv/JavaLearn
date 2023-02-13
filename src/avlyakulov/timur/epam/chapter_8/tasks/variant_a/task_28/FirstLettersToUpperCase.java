package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_28;

import java.util.Arrays;

/*
Преобразовать текст так, чтобы только первые буквы каждого предложения
были заглавными.
 */
public class FirstLettersToUpperCase {
    public static void main(String[] args) {
        String text = "Наше слово Было важное слово!Которое есть, Важным слово в нашем тексте.Поэтому Мы его пишем Вот так.Ты кто спросил Он у Вас";
        String[] sentences = text.split("[!.]");
        text = "";
        System.out.println(Arrays.toString(sentences));
        for (String s : sentences) {
            s = s.toLowerCase();
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            text += s + ".";
        }
        System.out.println(text);
    }
}