package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/*
Создать массив целых чисел. Используя лямбда-выражение, отсортировать
массив по убыванию.
 */
public class SortArrayDescending {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Function<Integer, Integer> fillArray = c -> (int) (Math.random() * 20 + 1);
        Consumer<int[]> printArr = a -> System.out.println(Arrays.toString(a));
        arr = Arrays.stream(arr).boxed().map(fillArray).mapToInt(o -> o).toArray();
        printArr.accept(arr);
        arr = Arrays.stream(arr).boxed().sorted((x, y) -> x > y ? -1 : x == y ? 0 : 1).mapToInt(o -> (int) o).toArray();
        printArr.accept(arr);
    }
}
