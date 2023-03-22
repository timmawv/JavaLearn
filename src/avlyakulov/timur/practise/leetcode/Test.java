package avlyakulov.timur.practise.leetcode;


import avlyakulov.timur.algorithms.Tree;

public class Test {
    public String sortSentence(String s) {
        String[] words = s.split("\\s");
        String result = "";
        for (int i = 1; i < words.length + 1; ++i) {
            for (String w : words)
                if (Character.getNumericValue(w.charAt(w.length() - 1)) == i) {
                    result = i == 1 ? result.concat(w.substring(0,w.length() - 1)) : result.concat(" " + w.substring(0,w.length() - 1));
                }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Test().sortSentence("is2 sentence4 This1 a3"));

    }
}
