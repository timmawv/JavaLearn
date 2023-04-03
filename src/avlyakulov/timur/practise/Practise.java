package avlyakulov.timur.practise;

import java.util.*;

public class Practise {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(12);
        queue.add(13);
        queue.add(11);
        queue.add(6);
        System.out.println("peek() - " + queue.peek()); // peek просто выводит элемент но не удаляет его
        System.out.println("poll() - " + queue.poll()); // poll выводит элемент и удаляет его
        System.out.println("offer() " + queue.offer(15)); // выводит true и добавляет элемент в коллецкию
        System.out.println("offer() " + queue.offer(13)); //проверяет, есть ли место в queue и если оно есть, то добавляет его в коллекцию
        System.out.println("element() - " + queue.element()); // берет последний элемент из очереди и просто выводит его
        Queue<Integer> queue1 = new ArrayDeque<>();
        System.out.println("Example with empty queue:");
        System.out.println("peek() - " + queue1.peek()); // peek просто выводит элемент но не удаляет его
        System.out.println("poll() - " + queue1.poll()); // poll выводит элемент и удаляет его
        // element() - генерирует исключение если искомого элемента не существует, остальные не генерируют
        // System.out.println("element() - " + queue1.element()); // берет последний элемент из очереди и просто выводит его
        System.out.println("offer() " + queue1.offer(15)); // выводит true и добавляет элемент в коллецкию
        System.out.println("offer() " + queue1.offer(13)); //проверяет, есть ли место в queue и если оно есть, то добавляет его в коллекцию


        System.out.println(queue);

    }
}