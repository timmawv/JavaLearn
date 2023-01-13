package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/*
Создать массив целых чисел. Убрать все четные элементы из массива и за-
полнить в конце нулями до прежнего размера массива.
 */
public class FillArrayNull {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Function<Integer, Integer> checkDivide = a -> a % 2 == 0 ? 0 : a;
        Function<Integer, Integer> fillArray = c -> (int) (Math.random() * 20);
        Consumer<int[]> printArr = a -> System.out.println(Arrays.toString(a));
        arr = Arrays.stream(arr).boxed().map(fillArray).map(checkDivide).mapToInt(o -> o).toArray();
        printArr.accept(arr);
        arr = Arrays.stream(arr).boxed().map(checkDivide).sorted((f, s) -> f == 0 ? 1 : s == 0 ? -1 : 0).mapToInt(o -> o).toArray();
        printArr.accept(arr);
    }
}