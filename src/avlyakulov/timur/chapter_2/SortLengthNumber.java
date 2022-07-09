package avlyakulov.timur.chapter_2;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины

import java.util.Arrays;
import java.util.Scanner;

public class SortLengthNumber {

    public static void sortNumLength() {
        Scanner in = new Scanner(System.in);
        int max = 0,min = 0;
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        Arrays.sort(mas);
        for(int i : mas)
            System.out.print("Mas" + i);
    }
}
