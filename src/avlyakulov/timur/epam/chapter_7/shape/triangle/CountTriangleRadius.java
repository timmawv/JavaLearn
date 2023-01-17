package avlyakulov.timur.epam.chapter_7.shape.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

/*
Дан прямоугольный треугольник с катетами a и b. С помощью лямбда-вы-
ражения найти радиус вписанной в треугольник окружности.
 */
public class CountTriangleRadius {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a");
            double legOne = Double.parseDouble(reader.readLine());
            System.out.println("Enter b");
            double legTwo = Double.parseDouble(reader.readLine());
            BiFunction<Double,Double,Double> countHypotenuse = (a,b) -> Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            CountRadiusTriangle countRadiusTriangle = (a,b,c) -> (a + b - c) / 2;
            System.out.println(countRadiusTriangle.countRadius(legOne,legTwo, countHypotenuse.apply(legOne,legTwo)));
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}