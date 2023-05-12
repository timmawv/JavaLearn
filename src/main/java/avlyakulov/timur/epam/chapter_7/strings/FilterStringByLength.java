package avlyakulov.timur.epam.chapter_7.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
В массиве строк найти все строки, начинающиеся на заданный символ
и состоящие из N букв.
 */
public class FilterStringByLength {

    public static void main(String[] args) throws IOException {
        String[] words = {"name","car","boy","joy","low","gang","mayor","cat"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of string ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Enter the letter from which need start word");
        String letter = reader.readLine().toLowerCase();
        Predicate<String> checkLength = str -> str.length() == length;
        Predicate<String> checkLetter = str -> str.startsWith(letter);
        System.out.println(Arrays.stream(words).filter(checkLength.and(checkLetter)).collect(Collectors.toList()));
    }
}