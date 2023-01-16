package avlyakulov.timur.epam.chapter_7.example.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ComparatorOwnTest {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s2.length() - s1.length();
        String[] arrStr = {"thousand", "car", "is", "book", "ice"};
        Arrays.stream(arrStr).sorted(comparator).forEach(s -> System.out.print(s + ' '));
        System.out.println();
        int[] arr = {10, 5, 7, 0, 2, 6, 12, 2, 0};
        Comparator<Integer> sortArr = Integer::compareTo;
        System.out.println(Arrays.stream(arr).boxed().sorted(sortArr).collect(Collectors.toList()));
    }
}