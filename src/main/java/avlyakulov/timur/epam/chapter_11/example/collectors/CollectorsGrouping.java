package avlyakulov.timur.epam.chapter_11.example.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGrouping {
    public static void main(String[] args) {
        List<String> strings = List.of("as a the d ann ans anw on and and the".split("\\s+"));

        //groupingBy(Function<? super T, ? extends K> classifier) — коллектор группировки элементов потока;
        Map<Integer, List<String>> mapByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapByLength);

        // группиреуем наши эелементы по длинне то есть ключ - длина строки значение количество таких строк в нашей коллекции
        Map<Integer, Long> mapOfValues = strings.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.counting()));
        System.out.println(mapOfValues);

        //partitioningBy(Predicate<? super T> predicate) — коллектор разбиения элементов потока;
        Map<Boolean, List<String>> mapOfBoolean = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 2));
        System.out.println(mapOfBoolean);
    }
}