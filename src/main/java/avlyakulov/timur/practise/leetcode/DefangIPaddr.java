package avlyakulov.timur.practise.leetcode;

public class DefangIPaddr {
    public String defangIPaddr(String address) {
        char[] word = address.toCharArray();
        int counter = 0;
        int counterWord = 0;
        for (char c : word)
            if (c == '.')
                ++counter;
        char[] newWord = new char[word.length + 2 * counter];
        for (int i = 0; i < word.length; i++) {
            newWord[counterWord] = word[i];
            ++counterWord;
            if (i != word.length - 1 && word[i + 1] == '.') {
                newWord[counterWord] = '[';
                ++counterWord;
            }
            if (word[i] == '.') {
                newWord[counterWord] = ']';
                ++counterWord;
            }
        }
        return String.valueOf(newWord);
    }

    public static void main(String[] args) {
        System.out.println(new DefangIPaddr().defangIPaddr("1.1.1.1"));
    }
}