package avlyakulov.timur.epam.chapter_7.numbers.bigger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Дано три разных целых числа. Реализовать лямбда-выражение, которое на-
ходит наибольшее из этих трех чисел.
 */
public class BiggerFromThree {
    public static void main(String[] args) {
        System.out.println("Enter 3 different numbers");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int firstNum = Integer.parseInt(reader.readLine());
            int secondNum = Integer.parseInt(reader.readLine());
            int thirdNum = Integer.parseInt(reader.readLine());
            CheckMore checkMore = (a, b, c) -> {
                if (a > b && a > c)
                    return a;
                else if (b > a && b > c) {
                    return b;
                } else return c;
            };
            System.out.println(checkMore.checkMoreFromThree(firstNum, secondNum, thirdNum));
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You have enter the wrong value " + e.getMessage());
        }
    }
}