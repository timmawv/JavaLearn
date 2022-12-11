package avlyakulov.timur.practise;

public class Main {

    public static void main(String[] args) {
        int[] a = {2};
        int[] b = {1, 2, 3, 6};
        int[] c = OneOfTwo.chooseOneFromTwo(a, b);
        for (int num : c)
            System.out.println(num);

    }
}