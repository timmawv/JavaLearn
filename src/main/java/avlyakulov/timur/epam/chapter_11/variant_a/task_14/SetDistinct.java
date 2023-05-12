package avlyakulov.timur.epam.chapter_11.variant_a.task_14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Задан файл с текстом на английском языке. Выделить все различные слова.
//Слова, отличающиеся только регистром букв, считать одинаковыми.
//Использовать класс HashSet.
public class SetDistinct {
    public void sortSet() {
        File file = new File("data/info.txt");
        String line = "";
        String[] words;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                line = line.concat(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        words = line.toLowerCase().split("\\s");
        System.out.println(Arrays.toString(words));
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println("Our set after adding elements");
        System.out.println(set);
    }
}