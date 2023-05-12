package avlyakulov.timur.epam.chapter_10.example.scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDelimiterMain {
    public static void main(String[] args) {
        double sum = 0;
        String numbersStr = "1,3;2,0; 8,5; 4,8;9,0; 1; 10;";
        Scanner sc = new Scanner(numbersStr)
                .useLocale(Locale.FRANCE)
                .useDelimiter(";\\s*");
        while (sc.hasNext()) {
            if (sc.hasNextDouble())
                sum += sc.nextDouble();
            else System.out.println("Not double " + sc.next());
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
