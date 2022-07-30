package avlyakulov.timur.book.chapter_2.numbers;

import java.util.Scanner;

public class FillArray {
    public static int [] fillArray () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int [] mas = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
        return mas;
    }
}
