package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_15;

import java.util.Arrays;

/*
Преобразовать каждое слово в тексте, удалив из него все следующие (предыдущие) вхождения первой (последней) буквы этого слова
 */
public class DeleteFirstAndLastSymbols {
    public static void main(String[] args) {
        String text = "Наше первое мим шалаш предложение было написано в яру вчера очень поздно вечером." +
                "Наше второе предложение вчера вечером есть очень хорошее?Наше кабак третье было предложение есть?";
        String[] words = text.split("[\\s.?]");
        System.out.println(Arrays.toString(words));
        text = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            if (sb.length() > 2)
                sb.deleteCharAt(0).deleteCharAt(sb.length() - 1);
            text += sb + " ";
        }
        System.out.println(text);
    }
}