package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой.
public class QuadraticEquation {
    public static void findRoots() {
        System.out.println("Квадратное уровнение вида: ax2 + bx + c");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ");
        double a = in.nextInt();
        System.out.print("Enter b ");
        double b = in.nextInt();
        System.out.print("Enter c ");
        double c = in.nextInt();
        double disk = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (disk < 0)
            System.out.println("Решений нет та как дискриминант меньше нуля");
        else if (disk == 0) {
            System.out.println("Мы имеем только 1 решение та как дискриминант равен нулю");
            double x = -b / (2 * a);
            System.out.println("Root: " + x);
        } else {
            double x1 = (-b + disk) / (2 * a);
            double x2 = (-b - disk) / (2 * a);
            System.out.println("Root of out equation are: x1: " + x1 + " " + " x2: " + x2);
        }
    }
}
