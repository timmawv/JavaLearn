package avlyakulov.timur.epam.chapter_7.shape.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
С помощью лямбда-выражений определить,
можно ли из длин сторон a, b, c образовать треугольник?
 */
public class CreateTriangle {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter side 1 of triangle");
            int side1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter side 2 of triangle");
            int side2 = Integer.parseInt(reader.readLine());
            System.out.println("Enter side 3 of triangle");
            int side3 = Integer.parseInt(reader.readLine());
            AbleToCreateTriangle ableToCreateTriangle = (a, b, c) -> (a + b) > c && (a + c) > b && (b + c) > a;
            if (ableToCreateTriangle.checkCreateTriangle(side1, side2, side3))
                System.out.println("Yes you can with this sides create triangle");
            else System.out.println("No you cant create triangle with this sides");
        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
