package avlyakulov.timur.practise;

import java.util.stream.Collectors;

public class Practise {
    public static void main(String[] args) {
        String sentence = "Hello people It is\n" +
                "new day of Life";
        sentence  = sentence.lines().map(String::toLowerCase).collect(Collectors.joining());
        System.out.println(sentence);
        String s = "";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        String str = "азбука";
        String str1 = "вино";
        System.out.println(str1.compareToIgnoreCase(str));
    }
}