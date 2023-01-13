package avlyakulov.timur.epam.chapter_7.numbers.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
Определить, является ли число элементом Фибоначчи с помощью лямбда-
выражений.
 */
public class CheckNumForFibonacci {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());
            Predicate<Integer> checkFibonacci;


        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
