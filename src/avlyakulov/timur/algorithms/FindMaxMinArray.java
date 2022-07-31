package avlyakulov.timur.algorithms;

import java.util.Scanner;

//find max and min in array
public class FindMaxMinArray {
    public static void findMinMax () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        int max = mas[0], min = mas[0];
        for (int i = 1; i < mas.length; ++i){
            if (mas[i] < max)
                max = mas[i];
            if (mas[i] > min)
                min = mas[i];
        }
        System.out.println("Max " + max + " Min " + min);
    }
}
