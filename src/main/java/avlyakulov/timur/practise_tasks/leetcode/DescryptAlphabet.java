package avlyakulov.timur.practise_tasks.leetcode;

public class DescryptAlphabet {

    /*public String freqAlphabets(String s) {
        String result = "";
        int num = 96;
        int counter = 1;
        String[] word = s.split("#");
        for (int i = 0; i < word.length; ++i) {
            if (i == word.length - 1) {
                for (int x = 0; x < word[i].length(); ++x) {
                    int curNum = Integer.parseInt(word[i].substring(x, counter));
                    curNum = num + curNum;
                    result = result.concat(Character.toString(curNum));
                    ++counter;
                }
            } else {
                int curNum = Integer.parseInt(word[i]);
                result = result.concat(Character.toString(num + curNum));
            }
        }
        return result;
    }*/

    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder("");
        int counter = 0;
        int num = 96;
        while (counter < s.length()) {
            if (counter < s.length() - 2 && s.charAt(counter + 2) == '#') {
                int curNum = Integer.parseInt(s.substring(counter, counter + 2));
                result.append(Character.toString(curNum + num));
                counter = counter + 3;
            } else {
                int curNum = Integer.parseInt(s.substring(counter, counter + 1));
                result.append(Character.toString(curNum + num));
                ++counter;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "1326#";
        System.out.println(new DescryptAlphabet().freqAlphabets(s));
    }
}