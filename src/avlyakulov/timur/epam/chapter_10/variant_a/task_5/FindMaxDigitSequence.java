package avlyakulov.timur.epam.chapter_10.variant_a.task_5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Найти в строке наибольшее число цифр, следующих подряд.
 */
public class FindMaxDigitSequence {
    public static void main(String[] args) {
        File file = new File("src\\avlyakulov\\timur\\epam\\chapter_10\\variant_a\\task_5\\info.txt");
        String numbers;
        try (Scanner sc = new Scanner(new FileReader(file))) {
            numbers = sc.nextLine();
            System.out.println(Arrays.stream(numbers.split("\\s"))
                    .max((s1, s2) -> s1.length() - s2.length())
                    .get());
        } catch (IOException e) {
            throw new RuntimeException("Can't find file", e);
        }
    }
}