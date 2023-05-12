package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_3;

import java.util.Arrays;

/*
Исключить из текста подстроку максимальной длины, начинающуюся и за-
канчивающуюся одним и тем же символом.
 */
public class DeleteAnagramFromText {
    public static void main(String[] args) {
        String text = "анкара коврик билет сова антарктида африка";
        String[] word = text.split("\\s");
        String wordMaxLength = Arrays.stream(word)
                .filter(s -> s.charAt(0) == s.charAt(s.length() - 1))
                .max((s1, s2) -> s1.length() - s2.length())
                .get();
        text = text.replace(wordMaxLength + " ","");
        System.out.println(text);
    }
}