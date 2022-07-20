package avlyakulov.timur.chapter_1;

import java.util.Scanner;

//Числа в порядке убывания частоты встречаемости чисел.
public class FrequencyNumbers {

    public static void sortFrequency() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array ");
        int len = in.nextInt();
        int[] mas = new int[len];
        int mark;
        int[] markArr = new int[len];
        System.out.print("Enter elements of array ");
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int i = 0; i < mas.length - 1; ++i) {
            mark = 0;
            for (int j = i + 1; j < mas.length; ++j) {
                if (mas[i] == mas[j]) {
                    ++mark;
                }
            }
            markArr[i] = mark;
        }
        for (int i : markArr )
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < markArr.length - 1; ++i)
            for (int j = i + 1; j < markArr.length; ++ j){
                if (markArr[i] < markArr[j]) {
                    int c = markArr[i];
                    markArr[i] = markArr[j];
                    markArr[j] = c;
                    int k = mas[i];
                    mas [i] = mas[j];
                    mas[j] = k;
                }
            }
        for (int i : markArr )
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < mas.length; ++i){
            if (markArr[i] != 0)
                System.out.println("Element " + mas[i] + " Frequency " + markArr[i]);
        }
    }
}