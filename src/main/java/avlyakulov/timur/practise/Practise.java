package avlyakulov.timur.practise;


public class Practise {
    public int commonFactors(int a, int b) {
        int counter = 0;
        int numMin = a > b ? b : a;
        int numMax = a > b ? a : b;
        for (int i = numMin; i > 0; --i) {
            if (numMax % i == 0 && numMin % i == 0)
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(new Practise().commonFactors(a, b));
    }
}