package avlyakulov.timur.epam.chapter_7.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

/*
Используя фильтр, создать новый массив из строк с числом символов больше заданного.
 */
public class FilterArraysToString {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 15, 34, 53, 745};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter num to compare");
        IntPredicate compareNumbers = a -> a > num;
        String result = Arrays.stream(arr).filter(compareNumbers).boxed().toList().toString();
        System.out.println(result);
    }
}