package avlyakulov.timur.practise;


public class Practise {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int num = 0;
        for (int i : gain) {
            num += i;
            max = max < num ? num : max;
        }
        return max;
    }

    public static void main(String[] args) {

    }
}