package avlyakulov.timur.tp;

public class Degree {
    public static double toDegree(double x, double n, double m) {
        return (pow(x, n)) % m;
    }
    public static double pow(double value, double powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }


    public static void printNumber(double x) {
        System.out.print("Your number is " + x);
    }
}