package avlyakulov.timur.epam.chapter_3.array.db;

import avlyakulov.timur.epam.chapter_3.array.entity.Massiv;

public class MassivDB {
    private static MassivDB instance;
    private static Massiv[] massivs;
    private static int current;

    private MassivDB() {
        massivs = new Massiv[10];
    }

    public static MassivDB getInstance() {
        if (instance == null)
            instance = new MassivDB();
        return instance;
    }

    public void createMassiv(Massiv massiv) {
        if (current == massivs.length) {
            Massiv[] massivs1 = new Massiv[massivs.length + 1];
            System.arraycopy(massivs, 0, massivs1, 0, massivs.length);
            massivs = massivs1;
        }
        massivs[current] = massiv;
        current++;
    }

    public void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            for (int j = 0; j < arr.length - 1; ++j)
                if (arr[j] > arr[j + 1]) {
                    int c = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = c;
                }
    }

    public void sortShaker(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                int c = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = c;
            }
        }
        for (int i = arr.length - 1; i > 0; --i) {
            if (arr[i] < arr[i - 1]) {
                int c = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = c;
            }
        }
    }

    public void sortSimpleChoose(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            int c = arr[i];
            arr[i] = arr[min];
            arr[min] = c;
        }
    }

    public void sortHash(int[] arr) {
        //todo работает ток со связаными списками доделать, как поймешь это
    }

    public void sortSimpleInsertion(int[] arr) {

    }

    public void sortBinaryMerge(int[] arr) {

    }

    public void sortShell(int[] arr) {

    }


    public Massiv[] findAll() {
        return massivs;
    }

}