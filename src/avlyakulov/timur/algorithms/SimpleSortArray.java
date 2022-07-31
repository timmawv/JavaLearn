package avlyakulov.timur.algorithms;

//simple sort array

import java.util.Scanner;

public class SimpleSortArray {
    public static void sortArray () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array - ");
        int len = sc.nextInt();
        int [] arr = new int[len];
        System.out.print("Enter elements of array ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length - 1; ++i)
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
        System.out.print("Elements of array: ");
        for (int i : arr)
            System.out.print(i + " ");
    }
}