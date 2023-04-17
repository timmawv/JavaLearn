package avlyakulov.timur.practise;

public class Practise {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        int counter = 0;
        char[] resArr = new char[s.length()];
        int counterResArr = 0;
        for (String w : words) {
            char[] wordArr = w.toCharArray();
            int middle = wordArr.length / 2;
            for (int i = wordArr.length - 1; i >= middle; --i) {
                resArr[counterResArr] = wordArr[i];
                ++counterResArr;
            }
            for (int i = middle - 1; i >= 0; --i) {
                resArr[counterResArr] = wordArr[i];
                ++counterResArr;
            }
            ++counter;
            if (counter == words.length) {
                break;
            } else {
                resArr[counterResArr] = ' ';
                ++counterResArr;
            }
        }
        return String.valueOf(resArr);
    }

    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(3 / 2);
        String res = new Practise().reverseWords(s);
        System.out.println(res);
        //Result  : "doG gniD"
    }
}