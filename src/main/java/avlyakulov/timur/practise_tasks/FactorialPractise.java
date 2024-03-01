package avlyakulov.timur.practise_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//функция по вычислению факториала
public class FactorialPractise {
    public static int countFactorialOfNumber(int num) {
        if (num != 1)
            num = num * countFactorialOfNumber(num - 1);
        return num;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your number to count factorial ");
            int num = Integer.parseInt(reader.readLine());
            System.out.println(countFactorialOfNumber(num));
        }
        catch (IOException | IllegalArgumentException | StackOverflowError e) {
            System.out.println(e.getMessage());
        }
    }
}