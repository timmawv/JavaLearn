package avlyakulov.timur.practise;

import java.util.Arrays;
import java.util.List;

public class Practise {
    public static void dirtyHeap(List<String>... stringLists) {
        Object[] array = stringLists;
        System.out.println(Arrays.toString(array));
        List<Integer> list = List.of(1,2,3,4);
        array[0] = list;
        System.out.println(array[0]);
        System.out.println((stringLists[0]));
        System.out.println(stringLists[1]);
    }

    public static void main(String[] args) {
        List<String> cars1 = Arrays.asList("Ford", "Fiat", "Kia");
        List<String> cars2 = Arrays.asList("Ferrari", "Bugatti", "Zaporozhets");
        dirtyHeap(cars1, cars2);
    }
}
