package avlyakulov.timur.chapter_2;

//Вывести на экран таблицу умножения.
public class MultiplicationTable {
    public static void printMultiplicationTable() {
        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j)
                System.out.print(i * j + " ");
            System.out.println();
        }
    }
}