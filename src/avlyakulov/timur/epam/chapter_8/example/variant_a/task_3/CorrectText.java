package avlyakulov.timur.epam.chapter_8.example.variant_a.task_3;

import java.util.Arrays;

/*
В тексте после буквы Р, если она не последняя в слове, ошибочно напечата-
на буква А вместо О. Внести исправления в текст.
 */
public class CorrectText {
    public static void main(String[] args) {
        String text = "Текст который был написан, в нашем слове ошибочно напечатана слово рама, ра двор тоже важное слово";
        String[] words = text.replace(",", "").split("\\s");
        System.out.println(Arrays.toString(words));
        int counter = 0;
        for (String w : words) {
            if (w.matches("(ра)[а-я]*")) {
                int index = w.indexOf('р');
                char[] wArr = w.toCharArray();
                wArr[index + 1] = 'о';
                words[counter] = String.valueOf(wArr);
            }
            ++counter;
        }
        System.out.println(Arrays.toString(words));
    }
}