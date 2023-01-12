package avlyakulov.timur.epam.chapter_7.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CheckDivide checkDivide = n -> n % 13 == 0;
        System.out.println("Enter your number, for check for divide for 13 ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(reader.readLine());
            if (checkDivide.checkDivideNumber(num))
                System.out.println("Yes your num divide for 13");
            else System.out.println("No, your num is not divide");
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}