package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.function.Consumer;

/*
Вывести массив NxN, заполненный по спирали в порядке возрастания.
 */
public class FillArraySpiral {
    public void printArray(int[] arr) {
        Consumer<int[]> printArr = t-> System.out.println(Arrays.toString(t));
        printArr.accept(arr);
    }

    public static void main(String[] args) {

    }
}