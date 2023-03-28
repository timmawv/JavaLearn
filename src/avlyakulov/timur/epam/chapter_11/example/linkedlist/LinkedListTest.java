package avlyakulov.timur.epam.chapter_11.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(1543);
        list.add(176);
        list.add(13);
        System.out.println(list);
        Iterator<Integer> integerIterator = list.descendingIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

    }
}