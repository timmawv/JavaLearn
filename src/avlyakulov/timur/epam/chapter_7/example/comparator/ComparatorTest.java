package avlyakulov.timur.epam.chapter_7.example.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        //базовая реализация компаратора для строк по убыванию их длин
        Comparator<String> comparator = (s1,s2) -> s2.length() - s1.length();
        //соритровка массива строк по убыванию их длинны выглядит вот так
        String str = "and java course epam the rose lion wolf hero green white red white";
        Arrays.stream(str.split("\\s"))
                .sorted(comparator)
                .forEach(s -> System.out.printf("%s ", s));
        System.out.println();
        //пример сортировки с thenComparing - просто применяет несколько сортировок одновременно
        Arrays.stream(str.split("\\s"))
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(String::compareTo))
                .forEach(s -> System.out.printf("%s ", s));
        System.out.println();
    }
}