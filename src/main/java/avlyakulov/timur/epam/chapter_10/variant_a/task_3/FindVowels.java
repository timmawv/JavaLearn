package avlyakulov.timur.epam.chapter_10.variant_a.task_3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
В каждой строке найти слова, начинающиеся с гласной буквы.
 */
public class FindVowels {
    public static void main(String[] args) {
        File fileRead = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_3\\info.txt");
        String vowels = "a e i o u";
        String text;
        int counterLines = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileRead))) {
            while (reader.ready()) {
                text = reader.readLine();
                System.out.println("Наша строчка которую мы считали " + text);
                System.out.printf("В %d линии нашего текста такие слова, которые начинаются на гласную букву:\n", counterLines);
                Pattern pattern = Pattern.compile("\\b\\w+\\b");
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    if (vowels.contains(String.valueOf(matcher.group().toLowerCase().charAt(0)))) {
                        System.out.println(matcher.group());
                    }

                }
                ++counterLines;
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}