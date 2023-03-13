package avlyakulov.timur.epam.chapter_11.example.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        List<Integer> list1 = List.of(12,13,14);
        list1.remove(1);
        System.out.println(list1);
    }
}