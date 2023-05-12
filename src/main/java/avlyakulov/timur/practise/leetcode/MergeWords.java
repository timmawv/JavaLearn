package avlyakulov.timur.practise.leetcode;

public class MergeWords {
    public String mergeAlternately(String word1, String word2) {
        int minLen = word1.length();
        int maxLen = word2.length();
        int counterArr = 0;
        if (minLen > maxLen) {
            int temp = minLen;
            minLen = maxLen;
            maxLen = temp;
        }
        char[] res = new char[minLen + maxLen];
        if (word1.length() == minLen) {
            for (int i = 0; i < minLen; ++i) {
                res[counterArr] = word1.charAt(i);
                ++counterArr;
                res[counterArr] = word2.charAt(i);
                ++counterArr;
            }
            for (int i = minLen; i < maxLen; ++i) {
                res[counterArr] = word2.charAt(i);
                ++counterArr;
            }
        } else {
            for (int i = 0; i < minLen; ++i) {
                res[counterArr] = word1.charAt(i);
                ++counterArr;
                res[counterArr] = word2.charAt(i);
                ++counterArr;
            }
            for (int i = minLen; i < maxLen; ++i) {
                res[counterArr] = word1.charAt(i);
                ++counterArr;
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(new MergeWords().mergeAlternately(word1,word2));

        //Input: word1 = "abc", word2 = "pqr"
        //Output: "apbqrs"
    }
}
