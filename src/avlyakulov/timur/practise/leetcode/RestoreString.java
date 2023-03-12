package avlyakulov.timur.practise.leetcode;

public class RestoreString {
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder(s.length());
        for (int i : indices) {
            System.out.println(s.charAt(i));
            result.setCharAt(i,s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indicies = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(new RestoreString().restoreString(s,indicies));
    }
}
