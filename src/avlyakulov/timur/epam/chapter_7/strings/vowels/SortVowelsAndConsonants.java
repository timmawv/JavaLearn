package avlyakulov.timur.epam.chapter_7.strings.vowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Дана строка. Вернуть строку, где сначала идут гласные, а потом согласные
из заданной строки. Гласные и согласные должны быть в отсортированном порядке
 */
public class SortVowelsAndConsonants {
    public static void main(String[] args) {
        String word = "абориген";
        List<String> vowels = new ArrayList<>();
        Function<String, String[]> splitWordToArray = s -> s.split(("(?<=.)"));
        String[] letters = splitWordToArray.apply(word);
        System.out.println(Arrays.toString(letters));
        vowels.add("а");
        vowels.add("о");
        vowels.add("у");
        vowels.add("э");
        vowels.add("и");
        vowels.add("ы");
        BiPredicate<List<String>, String> checkVowels = List::contains;
        List<String> vowelsWord = new ArrayList<>();
        List<String> consonantsWord = new ArrayList<>();
        Arrays.stream(letters).filter(t -> vowels.contains(t) ? vowelsWord.add(t) : consonantsWord.add(t)).collect(Collectors.toList());
        System.out.println(vowelsWord.stream().sorted().collect(Collectors.toList()));
        System.out.println(consonantsWord.stream().sorted().collect(Collectors.toList()));
        /*for (String w : letters)
            if (vowels.contains(w))
                vowelsWord.add(w);
            else consonantsWord.add(w);
        System.out.println("Наши гласные " + vowelsWord.stream().sorted().toList());
        System.out.println("Наши согласные " + consonantsWord.stream().sorted().toList());*/
    }
}