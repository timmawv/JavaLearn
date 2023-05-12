package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
Создать массив целых чисел. Убрать все четные элементы из массива и за-
полнить в конце нулями до прежнего размера массива.
 */
public class FillArrayNull {

    public static void main(String[] args) {
        Supplier<int[]> getArrInt = () -> new int[6];
        int[] arr = getArrInt.get();
        Function<Integer, Integer> checkDivide = a -> a % 2 == 0 ? 0 : a;
        Function<Integer, Integer> fillArray = c -> (int) (Math.random() * 20);
        Consumer<int[]> printArr = a -> System.out.println(Arrays.toString(a));
        arr = Arrays.stream(arr).boxed().map(fillArray).map(checkDivide).mapToInt(o -> o).toArray();
        printArr.accept(arr);
        Comparator<Integer> sortNullToEndList = (a, b) -> a == 0 ? 1 : b == 0 ? -1 : 0;
        arr = Arrays.stream(arr).boxed().map(checkDivide).sorted(sortNullToEndList).mapToInt(o -> o).toArray();
        printArr.accept(arr);
    }
}