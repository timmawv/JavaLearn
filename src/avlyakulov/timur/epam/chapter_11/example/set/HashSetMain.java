package avlyakulov.timur.epam.chapter_11.example.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetMain {
    public static void main(String[] args) {
        System.out.println("Example with HashSet");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("5Y");
        hashSet.add("Y-");
        hashSet.add("8Y");
        hashSet.add("2Y");
        hashSet.add("2Y");
        hashSet.add("8Y");
        hashSet.add("6Y");
        hashSet.stream()
                .peek(System.out::print)
                .forEach(s -> System.out.println(" " + s.hashCode()));
        //создание и преобразование множеств и их методы
        System.out.println("Example with Set and TreeSet");
        Set<String> set = Set.of("2Y", "8Y", "6Y", "5Y", "Y-");
        System.out.println(set);
        TreeSet<String> treeSet = new TreeSet<>(set);
        treeSet.add("Y-");
        System.out.println(treeSet);
        System.out.println(treeSet.last() + " " + treeSet.first());

    }
}