package avlyakulov.timur.epam.chapter_8.example.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String regex = "К.+?т";
        String s = "котенок Котяра кот котёл кот байкот";
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(s);
        int count = 0;
        while (mt.find()) {
            System.out.println(s.substring(mt.start(), mt.end()));
            ++count;
        }
        System.out.println(count);

        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("А.+?а");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }
        System.out.println(matcher.replaceFirst("Ира"));
        System.out.println(matcher.replaceAll("Ольга"));
        System.out.println(text);
    }
}