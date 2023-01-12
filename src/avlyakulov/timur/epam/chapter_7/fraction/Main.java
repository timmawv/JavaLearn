package avlyakulov.timur.epam.chapter_7.fraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            double a,b,c;
            System.out.println("Enter the a ");
            a = Double.parseDouble(reader.readLine());
            System.out.println("Enter the b ");
            b = Double.parseDouble(reader.readLine());
            System.out.println("Enter the c ");
            c = Double.parseDouble(reader.readLine());
            CalculateDiscriminant discriminant = (q,w,e) -> Math.pow(w,2) - 4 * q * e;
            System.out.println("Your discriminant is " + discriminant.calculateDiscriminant(a,b,c));

        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value, enter the num in format 1.32 " + e.getMessage());
        }
    }
}
