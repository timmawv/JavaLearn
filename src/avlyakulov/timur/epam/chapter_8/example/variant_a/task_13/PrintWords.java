package avlyakulov.timur.epam.chapter_8.example.variant_a.task_13;

import java.util.Arrays;

/*
Напечатать без повторения слова текста, у которых первая и последняя буквы совпадают
 */
public class PrintWords {
    public static void main(String[] args) {
        String text = "Наши слова обро вот такие, так что да анкара, котлета анкара, ада беза ала ада ада анкара ала обро";
        String[] words = text.split("[,\\s]");
        System.out.println(Arrays.toString(words));
        int counter = 0;
        for (String w : words) {
            ++counter;
            if (w != null && !w.isBlank() && w.charAt(0) == w.charAt(w.length() - 1)) {
                for (int i = counter; i < words.length; ++i) {
                    if (w.equals(words[i]))
                        words[i] = null;
                }
            }
        }
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length - 1; ++i)
            if (words[i] == null) {
                String w = words[i + 1];
                words[i + 1] = words[i];
                words[i] = w;
            }
        counter = 0;
        for (String w : words)
            if (w == null)
                ++counter;
        String[] words1 = new String[words.length - counter];
        System.arraycopy(words, 0, words1, 0, words.length - counter);
        words = words1;
        System.out.println(Arrays.toString(words));
        text = "";
        for (String w : words)
            text += w + " ";
        System.out.println(text);
    }
}