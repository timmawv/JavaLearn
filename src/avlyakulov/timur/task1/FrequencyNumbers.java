package avlyakulov.timur.task1;

import java.util.Scanner;
//Числа в порядке убывания частоты встречаемости чисел. (ДОДЕЛАТЬ)
public class FrequencyNumbers {

    public static void sortFrequency() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] mas = new int[len];

        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
    }
}
