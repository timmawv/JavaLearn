package avlyakulov.timur.practise.wildcard.numbers;

import java.util.List;

public class NumbersMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 13, 15, 6, 1, 2, 4, 52, 6);
        List<Double> numbers2 = List.of(12.5, 12.3);
        List<Integer> listResult = (List<Integer>) new UnionTwoNumbersList().unionLists(numbers, numbers2);
        System.out.println(listResult);
    }
}