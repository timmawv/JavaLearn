package avlyakulov.timur.epam.chapter_11.example.linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

public class PriorityMain {
    public static void main(String[] args) {
        Queue<Integer> prior = new ArrayDeque<>(){};
        prior.offer(12);
        prior.offer(20);
        prior.offer(10);
        prior.offer(5);
        prior.offer(15);
        prior.offer(18);
        prior.offer(2);
        prior.add(1);
        System.out.println(prior);
        System.out.println(prior.poll());
    }
}