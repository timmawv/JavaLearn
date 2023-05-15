package avlyakulov.timur.practise.leetcode;

import java.util.Arrays;

public class DescryptAlphabet {
    public String freqAlphabets(String s) {
        String result = "";
        String[] words = s.split("#");
        System.out.println(Arrays.toString(words));
        char num = 96;
        for (int j = 0; j < words.length; ++j)
            for (int i = 0; i < words[j].length(); ++i) {
                System.out.println(words[j].charAt(i));
                char temp = (char) (words[j].charAt(i) + num);
                System.out.println(temp);
                result = result.concat(String.valueOf(temp));
            }

        return result;
    }

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(new DescryptAlphabet().freqAlphabets(s));
        char num = 96;
        System.out.println((char) (1 + num));

    }
}