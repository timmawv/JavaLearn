package avlyakulov.timur.tp;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static int getFactorialMultiply(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static int getFactorialRecursion(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorialRecursion(f - 1);
        }
    }
    public static int getFactorialStream(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }
    public static int fillNumber(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number ");
        return in.nextInt();
    }
}
