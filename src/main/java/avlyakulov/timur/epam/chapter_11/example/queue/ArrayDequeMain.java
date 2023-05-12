package avlyakulov.timur.epam.chapter_11.example.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMain {
    //двуконечная очередь как стек и как очередь
    // stack - last in first out
    // queue - first in first out
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Наш стек после удаления наших элементов методом pop() " + stack);
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
        System.out.println("Наша очередь " + queue);
    }
}
