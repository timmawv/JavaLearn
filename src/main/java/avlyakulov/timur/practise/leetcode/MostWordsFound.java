package avlyakulov.timur.practise.leetcode;

public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int len = s.split("\\s").length;
            if (max < len)
                max = len;
        }
        return max;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        new MostWordsFound().mostWordsFound(sentences);
    }
}
