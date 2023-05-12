package avlyakulov.timur.practise.leetcode;

public class ReplaceDigits {
    //Input: s = "a1c1e1"
    //Output: "abcdef"
    //Explanation: The digits are replaced as follows:
    //- s[1] -> shift('a',1) = 'b'
    //- s[3] -> shift('c',1) = 'd'
    //- s[5] -> shift('e',1) = 'f'
    public String replaceDigits(String s) {
        char[] resChar = new char[s.length()];
        for (int i = 0; i < s.length(); ++i)
            if (Character.isDigit(s.charAt(i))) {
                int num = Character.getNumericValue(s.charAt(i));
                char letter = s.charAt(i - 1);
                for (int x = 0; x < num; ++x)
                    ++letter;
                resChar[i] = letter;
            } else {
                resChar[i] = s.charAt(i);
            }
        return String.valueOf(resChar);
    }
}
