package avlyakulov.timur.chapter_2;

import java.util.Scanner;

//Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них /todo(Доделать когда будут большие числа и надо будет найти минимальную разницу)
public class DifferentNumbers {
    public static void findMinDifferentNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = in.nextInt();
        int [] mas = new int[length];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; ++i)
            mas[i] = in.nextInt();
        for (int i : mas)
            if (String.valueOf(i).equals(reverse(String.valueOf(i))))
                System.out.println(i);
    }
    public static String reverse(String src) {
        String result = "";
        for (int i = 0; i < src.length(); i++) {
            result = src.charAt(i) + result;
        }
        return result;
    }
}
