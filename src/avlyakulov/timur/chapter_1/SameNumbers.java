package avlyakulov.timur.chapter_1;

import java.util.Scanner;
//Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
public class SameNumbers {
    public static void findSameNumbers() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] mas = new int[len];
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int i : mas) {
            int hun = i / 100;
            int ten = (i - hun * 100)/10;
            int un = i - hun * 100 - ten * 10;
            if (hun != ten && hun != un && ten != un)
                System.out.print(i + " ");
        }
    }
}

