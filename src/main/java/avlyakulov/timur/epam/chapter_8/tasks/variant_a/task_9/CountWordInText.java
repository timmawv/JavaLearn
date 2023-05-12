package avlyakulov.timur.epam.chapter_8.tasks.variant_a.task_9;

import java.util.Arrays;

/*
Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
 */
public class CountWordInText {
    public static void main(String[] args) {
        String text = "слово слово вода вода вода вода ракета ракета победа сын мать отец отец мать";
        String[] words = text.split(" ");
        int counterArr = 0;
        Arrays.sort(words);
        for (String w : words) {
            if (counterArr != 0 && words[counterArr].equals(words[counterArr - 1])) {
                ++counterArr;
                continue;
            }
            long counter = Arrays.stream(words).filter(str -> str.equals(w)).count();
            System.out.println(w + " количество повторений " + counter);
            ++counterArr;
        }
    }
}