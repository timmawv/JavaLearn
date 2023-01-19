package avlyakulov.timur.epam.chapter_8.example.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("x+y");
        Matcher matcher = pattern.matcher("xxxy");
        boolean res = matcher.matches();
        System.out.println(res);
    }
}