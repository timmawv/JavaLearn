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

    public Massiv[] findAll() {
        return massivs;
    }

}
