package avlyakulov.timur.practise;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        List<Integer> list1 = new ArrayList<>(list);
        list1.remove(1);
        System.out.println(list);
        System.out.println(list1);

    }
}