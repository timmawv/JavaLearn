package avlyakulov.timur.epam.chapter_11.variant_a.task_6;

import java.util.Set;
import java.util.TreeSet;

//Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
public class IntersectionsSet {
    public static void main(String[] args) {
        System.out.println("Example of intersection");
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Set<Integer> set1 = new TreeSet<>(set);
        set1.add(12);
        set1.add(20);
        System.out.println("set - " + set);
        System.out.println("set1 - " + set1);
        set1.retainAll(set);
        System.out.println("set1 after intersection with set");
        System.out.println(set1);
        System.out.println("Example of union for two sets");
        set.add(12);
        set.add(20);
        set.add(18);
        set1.add(14);
        set1.add(15);
        set1.add(35);
        System.out.println("set - " + set);
        System.out.println("set1 - " + set1);
        System.out.println("set after union with set1");
        set.addAll(set1);
        System.out.println(set);
    }
}