package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_19;

import java.util.Arrays;

/*
Все слова текста рассортировать в порядке убывания их длин, при этом все
слова одинаковой длины рассортировать в порядке возрастания в них коли-
чества гласных букв.
 */
public class SortByLengthAndVowel {
    public static void main(String[] args) {
        String text = "остров картун лейкак";
        String vowels = "а, о, и, ы, у, э";
        String[] words = text.replaceAll("\\.\\s", ".").replaceAll(",\\s", ",").split("[.,\\s]");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
        for (int j = 0; j < words.length; ++j)
            for (int i = 0; i < words.length - 1; ++i) {
                if (words[i].length() == words[i + 1].length()) {
                    int counterFirstWord = 0, counterSecondWord = 0;
                    for (int x = 0; x < words[i].length(); ++x) {
                        if (vowels.contains(String.valueOf(words[i].charAt(x))))
                            ++counterFirstWord;
                    }
                    for (int x = 0; x < words[i + 1].length(); ++x) {
                        if (vowels.contains(String.valueOf(words[i + 1].charAt(x))))
                            ++counterSecondWord;
                    }
                    if (counterFirstWord > counterSecondWord) {
                        String str = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = str;
                    }
                }
            }
        System.out.println(Arrays.toString(words));
    }
}