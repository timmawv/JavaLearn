package avlyakulov.timur.epam.chapter_7.example.predicate;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class PredicateTest2 {
    public static void main(String[] args) {
        IntPredicate predicateInt = i -> i <= 9 && i >= 2;
        int[] arr = {1, 4, 6, 10, 12, 5};
        System.out.println(Arrays.stream(arr)
                .filter(predicateInt.and(i -> i >= 5))
                .boxed()
                .collect(Collectors.toList()));
    }
}
