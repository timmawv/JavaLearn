package avlyakulov.timur.epam.chapter_11.habr_practise.task_1;

import java.util.*;
import java.util.stream.Collectors;

//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
public class CollectionWithNoDuplicates {
    public static List<Integer> collectionDistinctWithStream(List<Integer> list) {
        return list.stream().distinct().toList();
    }

    public static Set<Integer> collectionsDistinctWithSet(List<Integer> list) {
        return new HashSet<>(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(13);
        list.add(13);
        list.add(14);
        System.out.println("Начальная коллекция " + list);
        List<Integer> listDistinct = collectionDistinctWithStream(list);
        System.out.println("collectionDistinctWithStream");
        System.out.println("Коллекция без повторений " + listDistinct);
        System.out.println("collectionDistinctWithSet");
        Set<Integer> set = collectionsDistinctWithSet(list);
        System.out.println(set);
    }
}