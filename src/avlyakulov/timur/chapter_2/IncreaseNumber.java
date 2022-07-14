package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class IncreaseNumber {
    public static void findIncreaseNumber () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int [] mas = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
    }
}
