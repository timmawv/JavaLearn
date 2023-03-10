package avlyakulov.timur.epam.chapter_11.example.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        System.out.println(list);
        list.add(0,13);
        System.out.println(list);
    }
}