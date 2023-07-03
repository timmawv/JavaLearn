package avlyakulov.timur.practise;


import java.util.Arrays;

public class Practise {

    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        for (String w : words)
            if (w.startsWith(pref))
                ++counter;
        return counter;
    }

    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println(new Practise().prefixCount(words, pref));
    }
}