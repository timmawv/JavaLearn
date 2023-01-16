package avlyakulov.timur.epam.chapter_7.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;

/*
Написать функцию, которая вычисляет сумму списка аргументов
произвольной длины с разными типами элементов массива.
 */
public class SumElementsOfArray {
    public static void main(String[] args) {
        int n = 3;
        Supplier<String[]> createArrStr = () -> new String[n];
        String[] numbers = createArrStr.get();
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        double sum = sumArray(numbers);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Sum of your array is " + decimalFormat.format(sum));
    }

    public static void fillArray(String[] numbers) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println("Enter your number");
                numbers[i] = reader.readLine();
            }
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sumArray(String[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; ++i)
            sum += Double.parseDouble(numbers[i]);
        return sum;
    }
}