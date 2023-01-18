package avlyakulov.timur.epam.chapter_7.strings.reverse;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
С применением лямбда-выражения перевернуть входную строку.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word to reverse ");
        String word = sc.nextLine();
        System.out.println(word);
        Function<String, char[]> getArrayWords = t -> t.toCharArray();
        char[] words = getArrayWords.apply(word);
        BiFunction<char[], String, String> getReverseWord = (ar, t) -> {
            for (int i = ar.length - 1; i >= 0; --i)
                t += ar[i];
            return t;
        };
        String reverseWord = "";
        reverseWord = getReverseWord.apply(words, reverseWord);
        System.out.println(reverseWord);
        sc.close();
    }
}