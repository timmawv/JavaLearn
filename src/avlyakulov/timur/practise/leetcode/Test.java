package avlyakulov.timur.practise.leetcode;

public class Test {
    public int countConsistentStrings(String allowed, String[] words) {
        int number = 0;
        for (String w : words) {
            int counter = 0;
            for (int i = 0; i < w.length(); ++i)
                if (allowed.contains(String.valueOf(w.charAt(i))))
                    ++counter;
            if (counter == w.length())
                ++number;
        }
        return number;
    }

    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        System.out.println(new Test().countConsistentStrings(allowed, words));
    }
}