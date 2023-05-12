package avlyakulov.timur.epam.chapter_8.example.regular_expression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;

public class ExpressionTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("x+y");
        Matcher matcher = pattern.matcher("xxxy");
        System.out.println(matcher.matches());
        String regex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String input = "адреса эл.почты:blinov@gmail.com, romanchik@bsu.by!, , , rrggo76@gmail.com";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("email:" + matcher.group());
        }
        input = "java12;-lambda..[java9var";
        pattern = Pattern.compile("\\d+|\\p{Punct}+");
        String[] words = pattern.split(input);
        System.out.println(Arrays.toString(words));
        Stream<String> stream = pattern.splitAsStream(input);
        Pattern pattern1 = Pattern.compile("[^java]");
        stream.filter(pattern1.asPredicate()).forEach(s -> System.out.print(s + " "));
    }
}