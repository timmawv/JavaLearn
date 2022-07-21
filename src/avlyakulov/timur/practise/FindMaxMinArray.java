package avlyakulov.timur.practise;

import java.util.Scanner;

//find max and min in array
public class FindMaxMinArray {
    public static void findMinMax () {
        Scanner in = new Scanner(System.in);
        int max = 0,min = 0;
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
    }
}
