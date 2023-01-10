package avlyakulov.timur.epam.chapter_7.anagram;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/*
Определить, являются ли слова анаграммами
т.е. можно ли из одного слова составить другое перестановкой букв.
 */
public class AnagramPractise {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the word ");
            String word = reader.readLine();
            System.out.println("Enter the word that you think it is anagram");
            String anagram = reader.readLine();
            BiPredicate<String, String> predicateTestLength = (w1, w2) -> w1.length() == w2.length();
            Function<String,String[]> splitWordToArray = s-> s.split(("(?!^)"));
            System.out.println(Arrays.stream(splitWordToArray.apply(word)).sorted().collect(Collectors.toList()));
            BiPredicate<List, List> checkEqualList = (l1,l2) -> l1.equals(l2);


        if (!predicateTestLength.test(word, anagram))
            System.out.println("Your words are not anagrams");
        else {
            if (checkEqualList.test(Arrays.stream(splitWordToArray.apply(word)).sorted().collect(Collectors.toList()),Arrays.stream(splitWordToArray.apply(anagram)).sorted().collect(Collectors.toList())))
                System.out.println("Your words are anagrams");
            else System.out.println("Your words are not anagrams");
        }

    } catch(IOException |
    IllegalArgumentException e)

    {
        System.out.println("You have enter the wrong value " + e.getMessage());
    }
}
}
