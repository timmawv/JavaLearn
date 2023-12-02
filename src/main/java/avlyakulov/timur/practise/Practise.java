package avlyakulov.timur.practise;

import java.util.*;

public class Practise {

    public static void main(String[] args) {
        Queue<Integer> arrayDeque = new ArrayDeque<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        arrayDeque.add(12);
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(5);
        arrayDeque.add(4);
        System.out.println(arrayDeque);
        priorityQueue.offer(12);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            int highestPriorityElement = priorityQueue.poll();
            System.out.println(highestPriorityElement);
        }
        System.out.println(priorityQueue);
    }
}