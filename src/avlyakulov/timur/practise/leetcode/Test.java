package avlyakulov.timur.practise.leetcode;


public class Test {
    public int xorOperation(int n, int start) {
        int sum = start;
        for (int i = 0; i < n - 1; ++i) {
            sum = sum ^ (start + 2);
            start += 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new Test().xorOperation(5,0));
    }
}
