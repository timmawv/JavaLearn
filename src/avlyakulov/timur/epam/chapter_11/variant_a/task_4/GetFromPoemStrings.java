package avlyakulov.timur.epam.chapter_11.variant_a.task_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Занести стихотворения одного автора в список. Провести сортировку по возрастанию длин строк.
public class GetFromPoemStrings {
    public void getFromPoemStrings() {
        File file = new File("data/fileText.txt");
        List<String[]> lines = new ArrayList<>();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                lines.add(line.split("\\s"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lines.stream().sorted((s1,s2) -> s1.length - s2.length).forEach(arr -> System.out.println(Arrays.toString(arr)));
    }
}