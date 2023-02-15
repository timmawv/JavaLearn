package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_12;

import java.util.Arrays;
import java.util.Scanner;

/*
Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 */
public class DeleteSpecificWords {
    public static void main(String[] args) {
        String text = "Наше первое предложение было написано вчера очень поздно вечером.Наше второе предложение вчера вечером есть очень хорошее?Наше третье было предложение есть?";
        String consonantsLetters = "Б, В, Г, Д, Ж, З, Й, К, Л, М, Н, П, Р, С, Т, Ф, Х, Ц, Ч, Ш, Щ".toLowerCase();
        String[] sentences = text.split("[.?]");
        System.out.println(Arrays.toString(sentences));
        System.out.println("Введите длину слова которую надо удалить ");
        int length = new Scanner(System.in).nextInt();
        text = "";
        for (String s : sentences) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; ++i)
                if (words[i].length() == length && consonantsLetters.contains(words[i].substring(0, 1).toLowerCase())) {
                    words[i] = null;
                }
            for (int j = 0; j < words.length; ++j) {
                for (int x = 0; x < words.length - 1; ++x)
                    if (words[x] == null) {
                        String w = words[x];
                        words[x] = words[x + 1];
                        words[x + 1] = w;
                    }
            }
            long counterNull = Arrays.stream(words).filter(str -> str == null).count();
            String[] words1 = new String[words.length - (int)counterNull];
            System.arraycopy(words,0,words1,0,words.length - (int)counterNull);
            words = words1;
            System.out.println(Arrays.toString(words));
            s = "";
            for (String w : words) {
                s += w + " ";
            }
            text += s +". ";
        }
        System.out.println(text);
    }
}