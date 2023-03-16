package avlyakulov.timur.epam.chapter_11.example.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {
            {
                this.offer("Jeans");
            }
        };

        queue.add("Dresses");
        queue.offer("Gloves");
        queue.offer("T-Shirt");
        queue.stream()
                .filter(s -> !s.endsWith("s"))
                .forEach(System.out::println);
        System.out.println("_______");
        queue.forEach(System.out::println);
    }
}