package avlyakulov.timur.epam.chapter_11.variant_a.task_15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDistinct {
    public void sortMap() {
        File file = new File("data/info.txt");
        Map<String, Long> map;
        String line = "";
        String[] words;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                line = line.toLowerCase().concat(reader.readLine() + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(line);
        words = line.split("\\s+");
        System.out.println(Arrays.toString(words));
        map = Arrays.stream(words).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map);
    }
}
