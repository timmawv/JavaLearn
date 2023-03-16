package avlyakulov.timur.epam.chapter_11.example.linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityMain {
    public static void main(String[] args) {
        Queue<Integer> prior = new PriorityQueue<>(Comparator.reverseOrder());
        prior.offer(12);
        prior.offer(20);
        prior.offer(10);
        prior.offer(5);
        prior.offer(15);
        prior.offer(18);
        prior.offer(2);
        prior.add(1);
        prior.forEach(System.out::println);
    }
}