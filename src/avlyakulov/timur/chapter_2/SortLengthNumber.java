package avlyakulov.timur.chapter_2;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины (очень непонятно)

import java.util.Arrays;
import java.util.Scanner;

public class SortLengthNumber {

    public static void sortNumLength() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.print("Enter numbers ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        Arrays.sort(mas); //todo (доделать задачу когда поймёшь как сортировать по длинне числа)
        System.out.print("Mas: ");
        for (int i : mas)
            System.out.print(i + " ");
    }
}