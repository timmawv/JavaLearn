package avlyakulov.timur.epam.chapter_7.example.predicate;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicateStr1 = s -> s.length() < 2;
        Predicate<String> predicateStr2 = String::isBlank;
        Predicate<Integer> predicateInt = i -> i >= 9;
        //simple example of predicate
        System.out.println(predicateStr1.test("sfasdfa"));
        System.out.println(predicateStr2.test("fasdf"));
        System.out.println(predicateInt.test(1));

        //example with stream
        String[] arrayStr = {"as", "a", "the", " ", "d", "on", "and", ""};
        System.out.println(Arrays.stream(arrayStr)
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList()));
        System.out.println(Arrays.stream(arrayStr).anyMatch(String::isBlank));
        System.out.println(Arrays.stream(arrayStr).allMatch(String::isBlank));
        int[] arrayInt = {1, 3, 5, 9, 17, 33, 65};
        System.out.println(Arrays.stream(arrayInt).anyMatch(i -> i >= 1));
        //example with logical AND with our predicate
        Predicate<String> predicateStr3 = s -> s.contains("a");
        System.out.println(Arrays.stream(arrayStr)
                .filter(predicateStr3.and(s -> s.contains("n")))
                .collect(Collectors.toList()));
        //the same example without link on predicate3
        System.out.println(Arrays.stream(arrayStr)
                .filter(((Predicate<String>) s -> s.contains("a")).and(s -> s.contains("n")).and(s -> s.contains("d")).and(s -> s.length() > 2))
                .collect(Collectors.toList()));

        //example with logical OR
        System.out.println(Arrays.stream(arrayInt)
                .filter(((IntPredicate) i -> i > 32).or(i -> i < 4))
                .boxed()
                .collect(Collectors.toList()));
        //example with negate() отрицание
        System.out.println(Arrays.stream(arrayStr)
                .filter(((Predicate<String>) s -> s.contains("a")).and(s -> s.contains("n")).negate())
                .collect(Collectors.toList()));
        //example with not более короткое отрицание
        System.out.println(Arrays.stream(arrayStr)
                .filter(Predicate.not(s -> s.contains("and")))
                .collect(Collectors.toList()));
        //example with isEqual - нужен для точного поиска тоже самое что и s -> s.equals("and")
        System.out.println(Arrays.stream(arrayStr)
                .filter(Predicate.isEqual("and"))
                .collect(Collectors.toList()));
        //write predicate for search by me
        System.out.println(Arrays.stream(arrayStr)
                .filter((s -> s.equals("and")))
                .collect(Collectors.toList()));
        //BiPredicate with two Generic
        BiPredicate<String, Integer> biPredicate = (s, max) -> s.length() <= max;
        System.out.println(biPredicate.test("java",12));
    }
}
