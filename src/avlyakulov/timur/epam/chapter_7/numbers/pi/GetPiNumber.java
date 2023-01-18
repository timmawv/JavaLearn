package avlyakulov.timur.epam.chapter_7.numbers.pi;

import java.util.function.Supplier;

/*
Написать программу, возвращающую значения числа Пи, используя
лямбда-выражения.
 */
public class GetPiNumber {
    public static void main(String[] args) {
        Supplier<Double> getPiNumber = () -> Math.PI;
        double pi = getPiNumber.get();
        System.out.println(pi);
    }
}