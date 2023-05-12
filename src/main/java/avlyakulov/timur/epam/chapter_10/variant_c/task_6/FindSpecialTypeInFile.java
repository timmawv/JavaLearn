package avlyakulov.timur.epam.chapter_10.variant_c.task_6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Файл содержит символы, слова, целые числа и числа с плавающей запятой.
Определить все данные, тип которых вводится из командной строки.
 */
public class FindSpecialTypeInFile {

    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_c\\task_6\\text.txt");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите ваше значение, чтоб опеределить его тип");
            String value = reader.readLine();
            Types type = Types.getType(value);
            System.out.println("Тип вашего значения - " + type);
            System.out.println("Данные из файла которые соответствуют вашему значению");
            switch (type) {
                case INT -> {
                    Stream<String> lines = Files.lines(Path.of(file.getPath()));
                    String result = lines.collect(Collectors.joining());
                    Arrays.stream(result.split("\\s"))
                            .filter(s -> !s.contains(".") && !s.contains(",") && s.matches("\\d+"))
                            .forEach(System.out::println);
                    lines.close();
                }

                case DOUBLE -> {
                    Stream<String> lines = Files.lines(Path.of(file.getPath()));
                    String result = lines.collect(Collectors.joining());
                    Pattern pattern = Pattern.compile("[0-9]*[.,][0-9]+");
                    Matcher matcher = pattern.matcher(result);
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    lines.close();
                }
                default -> {
                    Stream<String> lines = Files.lines(Path.of(file.getPath()));
                    String result = lines.collect(Collectors.joining());
                    Pattern pattern = Pattern.compile("[a-z]+");
                    Matcher matcher = pattern.matcher(result);
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    lines.close();
                }
            }

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("Exception", e);
        }
    }
}