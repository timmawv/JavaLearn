package avlyakulov.timur.practise_tasks.leetcode;

public class LengthLastWord {
    public int LengthOfLastWord (String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "fly to the moon  ";
        LengthLastWord lengthLastWord = new LengthLastWord();
        System.out.println(lengthLastWord.LengthOfLastWord(s));
    }
}