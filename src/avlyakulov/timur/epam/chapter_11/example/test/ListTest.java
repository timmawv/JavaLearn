package avlyakulov.timur.epam.chapter_11.example.test;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(20);
        list.add(30);
        list.add(45);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
