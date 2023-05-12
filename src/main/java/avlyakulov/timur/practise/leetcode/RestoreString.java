package avlyakulov.timur.practise.leetcode;

public class RestoreString {
    public String restoreString(String s, int[] indices) {
        char[] word = new char[indices.length];
        for (int i = 0; i < indices.length; ++i) {
            word[indices[i]] = s.charAt(i);
        }
        return String.valueOf(word);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indicies = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(new RestoreString().restoreString(s,indicies));
    }
}