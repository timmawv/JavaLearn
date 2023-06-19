package avlyakulov.timur.practise;


import java.util.Arrays;

public class Practise {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length() + 1];
        int counterI = 0;
        int counterD = s.length();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'I') {
                arr[i] = counterI++;
            } else {
                arr[i] = counterD--;
            }
        }
        arr[s.length()] = s.charAt(s.length() - 1) == 'I' ? counterI : counterD;
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Practise().diStringMatch("IDID")));

    }
}