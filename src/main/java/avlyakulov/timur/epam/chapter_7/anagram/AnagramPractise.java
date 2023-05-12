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
    public WordAnagramUtil fillWordAndAnagram() {
        String word = "";
        String anagram = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the word ");
            word = reader.readLine();
            System.out.println("Enter the word that you think it is anagram");
            anagram = reader.readLine();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
        return new WordAnagramUtil(word, anagram);
    }
    public boolean checkWordsLength (WordAnagramUtil wordAnagramUtil) {
        BiPredicate<String, String> predicateTestLength = (w1, w2) -> w1.length() == w2.length();
        return predicateTestLength.test(wordAnagramUtil.getWord(), wordAnagramUtil.getAnagram());
    }
    public List<String> converToList (String str) {
        Function<String, String[]> splitWordToArray = s -> s.split(("(?<=.)"));
        return Arrays.stream(splitWordToArray.apply(str)).sorted().collect(Collectors.toList());
    }
    public boolean checkLengthLists (List<String> listWord,List<String> listAnagram) {
        BiPredicate<List<String>, List<String>> checkEqualList = List::equals;
        return checkEqualList.test(listWord,listAnagram);
    }
    public void run() {
        WordAnagramUtil wordAnagramUtil = fillWordAndAnagram();
        if (!checkWordsLength(wordAnagramUtil)) {
            System.out.println("Your words are not anagrams");
        }
        else {
            List<String> listWord = converToList(wordAnagramUtil.getWord());
            List<String> listAnagram = converToList(wordAnagramUtil.getAnagram());
            if (checkLengthLists(listWord,listAnagram))
                System.out.println("Your words are anagrams");
            else System.out.println("No your words are not anagrams");
        }
    }


    public static void main(String[] args) {
        new AnagramPractise().run();
    }
}

class WordAnagramUtil {
    String word;
    String anagram;

    public WordAnagramUtil(String word, String anagram) {
        this.word = word;
        this.anagram = anagram;
    }

    public String getWord() {
        return word;
    }

    public String getAnagram() {
        return anagram;
    }
}
