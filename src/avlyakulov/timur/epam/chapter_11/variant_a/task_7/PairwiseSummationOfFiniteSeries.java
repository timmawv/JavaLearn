package avlyakulov.timur.epam.chapter_11.variant_a.task_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

//С использованием множества выполнить попарное суммирование произ-
//вольного конечного ряда чисел по следующим правилам: на первом этапе
//суммируются попарно рядом стоящие числа, на втором этапе суммируются
//результаты первого этапа и т.д. до тех пор, пока не останется одно число.
//представим, что наш ряд имеет такой вид, как S = 1 + a^1 + a^2 + ... + a ^ n
// где a - любое целое число, которое является положительным и не равно 1, та как Set - набор уникальных значений
public class PairwiseSummationOfFiniteSeries {
    public void pairwiseSummationOfFiniteSeries() {
        long sum = 0;
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        int degree = 0;
        int a = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a - ");
            a = Integer.parseInt(reader.readLine());
            System.out.print("Enter the degree of our series ");
            degree = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int counterDegree = 1;
        for (int i = 0; i < degree; i++) {
            set.add(Math.pow(a, counterDegree));
            ++counterDegree;
        }
        System.out.println(set);
        sum = set.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Сумма конечного ряда равна " + sum);
    }

     static class Math {
        public static int pow(int a, int degree) {
            int result = 1;
            for (int i = 0; i < degree; ++i) {
                result *= a;
            }
            return result;
        }
    }
}