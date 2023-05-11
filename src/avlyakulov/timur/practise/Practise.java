package avlyakulov.timur.practise;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Practise {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        int counter = 0;
        char[] resArr = new char[s.length()];
        int counterResArr = 0;
        for (String w : words) {
            char[] wordArr = w.toCharArray();
            int middle = wordArr.length / 2;
            for (int i = wordArr.length - 1; i >= middle; --i) {
                resArr[counterResArr] = wordArr[i];
                ++counterResArr;
            }
            for (int i = middle - 1; i >= 0; --i) {
                resArr[counterResArr] = wordArr[i];
                ++counterResArr;
            }
            ++counter;
            if (counter == words.length) {
                break;
            } else {
                resArr[counterResArr] = ' ';
                ++counterResArr;
            }
        }
        return String.valueOf(resArr);
    }

    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(3 / 2);
        String res = new Practise().reverseWords(s);
        System.out.println(res);
        //Result  : "doG gniD"
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        for (int i = 0; i < heights.length; ++i) {
            for (int x = 0; x < heights.length - 1; ++x) {
                if (heights[x] < heights[x + 1]) {
                    int temp = heights[x];
                    heights[x] = heights[x + 1];
                    heights[x + 1] = temp;
                    String w = names[x];
                    names[x] = names[x + 1];
                    names[x + 1] = w;
                }
            }
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }
}