package avlyakulov.timur.epam.chapter_11.example.queue;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<StringBuilder> queue = new PriorityQueue<>();
        queue.add(new StringBuilder("str"));
        queue.add(new StringBuilder("car"));
        queue.add(new StringBuilder("cat"));
        queue.add(new StringBuilder("arg"));
        queue.add(new StringBuilder("abc"));
        System.out.println(queue);
        Set<String> set = Set.of("cat","dog","weak","year");
        System.out.println(set);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("cat");
        treeSet.add("dog");
        treeSet.add("weak");
        treeSet.add("year");
        System.out.println(treeSet);
    }
}