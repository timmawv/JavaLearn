package avlyakulov.timur.practise_tasks;

public class OneOfTwo {
    public static int[] chooseOneFromTwo(int[] array1, int[] array2) {
        boolean checkLength;
        checkLength = array1.length > array2.length;
        if (checkLength) {
            int[] newArray = new int[array1.length];
            System.arraycopy(array2, 0, newArray, array1.length - array2.length, array2.length);
            array2 = newArray;
        }
        else  {
            int[] newArray = new int[array2.length];
            System.arraycopy(array1, 0, newArray, array2.length - array1.length, array1.length);
            array1 = newArray;
        }
        if (checkLength)
            return array2;
        else return array1;
    }
}
