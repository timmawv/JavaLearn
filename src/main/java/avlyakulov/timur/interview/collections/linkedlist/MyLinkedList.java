package avlyakulov.timur.interview.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("dd");
        list.add("dd");
        list.add("dd");
        String s = list.get(2);
        System.out.println(s);
    }
}