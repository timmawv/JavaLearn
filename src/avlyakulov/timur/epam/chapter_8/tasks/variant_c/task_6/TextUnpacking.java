package avlyakulov.timur.epam.chapter_8.tasks.variant_c.task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Распаковать текст, сжатый по правилу из предыдущего задания.
 */
public class TextUnpacking {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hel2o peo7ple it is ou6r wo3rld gu4ys");
        Pattern pattern = Pattern.compile("[a-z]\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
            int startWord = matcher.start();
            int numLetters = Integer.parseInt(text.substring(startWord + 1, startWord + 2));
            text.deleteCharAt(startWord + 1);
            for (int i = 0; i < numLetters - 1; ++i) {
                text.insert(startWord + 1, text.charAt(startWord));
            }
        }
        System.out.println(text);
    }
}