package avlyakulov.timur.practise.leetcode;

import java.io.CharArrayReader;
import java.util.Arrays;

public class DescryptAlphabet {
    public String freqAlphabets(String s) {
        String result = "";
        int num = 96;
        String[] word = s.split("#");
        for (int i = 0; i < word.length; ++i) {
            if (i == word.length - 1) {
                for (int x = 0; x < word[i].length(); ++x) {
                    char curNum = word[i].charAt(x);
                    num = num + curNum;
                    result = result.concat(Character.toString(num));
                }
            } else {
                int curNum = Integer.parseInt(word[i]);
                result = result.concat(Character.toString(num + curNum));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(new DescryptAlphabet().freqAlphabets(s));
        char num = 96;
        char n = 1;
        String ab = Character.toString(num + n);
        System.out.println(ab);
        String a = Character.toString(num + 1);
        System.out.println(a);

    }
}