package avlyakulov.timur.practise;

import java.util.regex.Pattern;

public class RegexJavaPractise {
    public static void main(String[] args) {
        String text = "Hel2o peo7ple it is ou6r wo3rld gu4ys";
        text = Pattern.compile("([a-z])(\\d)")
                .matcher(text)
                .replaceAll(mr -> mr.group(1).repeat(Integer.parseInt(mr.group(2))));

        System.out.println(text);
    }
}
