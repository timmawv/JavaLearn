package avlyakulov.timur.epam.chapter_7.numbers.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.IntPredicate;


/*
Определить, является ли число элементом Фибоначчи с помощью лямбда выражений.
 */
public class CheckNumForFibonacci {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number that you want to check from numbers Fibonacci");
            int num = Integer.parseInt(reader.readLine());
            int[] numbersFibonacci = {1, 1, 2, 3, 5, 8, 13, 21, 34};
            IntPredicate checkNumFibonacci = a -> a == num;
            if (Arrays.stream(numbersFibonacci).anyMatch(checkNumFibonacci))
                System.out.println("Yes your number is number of Fibonacci");
            else System.out.println("No your number is not number of Fibonacci");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}