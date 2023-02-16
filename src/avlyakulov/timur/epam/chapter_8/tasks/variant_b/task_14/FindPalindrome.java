package avlyakulov.timur.epam.chapter_8.tasks.variant_b.task_14;

import java.util.Arrays;
import java.util.Comparator;

/*
В заданном тексте найти подстроку максимальной длины, являющуюся палиндромом, т.е. читающуюся слева направо и справа налево одинаково.
 */
public class FindPalindrome {
    public static void main(String[] args) {
        String text = "Наше первое мим шалаш предложение было написано в яру вчера очень поздно вечером." +
                "Наше второе предложение вчера вечером есть очень хорошее?Наше кабак третье было предложение есть?";
        String[] words = new String[text.split("[\\s.?]").length];
        int counter = 0;
        for (String w : text.split("[\\s.?]")) {
            words[counter] = w;
            ++counter;
        }
        System.out.println(Arrays.toString(words));
        String w = Arrays.stream(words)
                .filter(FindPalindrome::checkPalindromeWord)
                .max(Comparator.comparingInt(String::length)).get();
        System.out.printf("Слово палиндром максимальной длины %s",w);
    }

    public static boolean checkPalindromeWord (String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}