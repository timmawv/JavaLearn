package avlyakulov.timur.tp;

import java.util.Scanner;

public class Degree {
    public static double toDegree() {
        double x = 0;
        x = fillNumber(x);
        double n = 0;
        n = fillNumber(n);
        double m = 0;
        m = fillNumber(m);
        double result;
        x = fillNumber(x);
        n = fillNumber(n);
        m = fillNumber(m);
        return result = Math.pow(x, n) % m;
    }

    public static double fillNumber(double x) {
        System.out.println("Enter your number");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        return x;
    }

    public static void printNumber(double x) {
        System.out.println("Your number" + x);
    }
}
