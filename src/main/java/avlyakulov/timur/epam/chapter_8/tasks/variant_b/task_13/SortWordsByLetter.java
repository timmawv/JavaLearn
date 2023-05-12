package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_13;

import java.util.Scanner;

/*
Отсортировать слова в тексте по убыванию количества вхождений заданного символа, а в случае равенства — по алфавиту.
 */
public class SortWordsByLetter {
    public static void main(String[] args) {
        String text = "Наше первое предложение было написано в яру анкара вчера очень поздно вечером.Наше второе предложение вчера вечером есть очень хорошее?Наше третье было предложение есть?";
        System.out.println(text);
        System.out.println("Введите заданый символ для того чтоб отсортировать слова ");
        char letter = new Scanner(System.in).nextLine().charAt(0);
        System.out.println(letter);
        String[] words = text.split("[\\s.?]");
        int[] arrCounter = new int[words.length];
        int counter;
        for (int j = 0; j < words.length; ++j) {
            counter = 0;
            for (int i = 0; i < words[j].length(); ++i) {
                if (letter == words[j].toLowerCase().charAt(i))
                    ++counter;
            }
            arrCounter[j] = counter;
        }
        for (int i = 0; i < words.length; ++i)
            for (int j = 0; j < words.length - 1; ++j)
                if (arrCounter[j] < arrCounter[j + 1]) {
                    int num = arrCounter[j];
                    arrCounter[j] = arrCounter[j + 1];
                    arrCounter[j + 1] = num;
                    String str = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = str;
                }
        for (int j = 0; j < words.length; ++j)
            for (int i = 0; i < words.length - 1; ++i) {
                if (arrCounter[i] == arrCounter[i + 1] && words[i].compareToIgnoreCase(words[i + 1]) > 0) {
                    String str = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = str;
                }
            }
        text = "";
        for (String w : words)
            text += w +" ";
        System.out.println(text);
    }
}