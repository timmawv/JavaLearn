package avlyakulov.timur.epam.chapter_7.numbers.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;


/*
С помощью лямбда-выражений вычислить факториал заданного числа.
 */
public class CountFactorialNumber {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your num to find his factorial ");
            int num = Integer.parseInt(reader.readLine());
            Consumer<Integer> factorialNum = t -> {
                for (int i = num - 1; i > 1; --i) {
                    t = t * i;
                }
                System.out.println(t);
            };
            factorialNum.accept(num);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}