package avlyakulov.timur.book.chapter_1;

import java.util.Scanner;

// Элементы, которые равны полусумме соседних элементов.
public class FloorSumNeighboring {
    public int[] sumNeighboring() {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int [] mas = new int[len];
        int [] elem = new int [len - 2];
        for (int i = 0; i < len; ++i) {
            mas[i] = in.nextInt();
        }
        for (int i = 1; i < len - 1; ++i) {
            if (mas[i] == (mas[i - 1] + mas[i + 1]) / 2) {
                elem[i-1] = mas[i];
            }
        }
        return elem;
    }

}