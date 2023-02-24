package avlyakulov.timur.epam.chapter_10.example.reading_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadStringMainJava8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data\\res.txt"))) {
            Stream<String> stream = reader.lines();
            String lines = stream.collect(Collectors.joining());
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //В класс Files добавлен статический метод newBufferedReader(Path path), создающий объект BufferedReader.
        Path path = Paths.get("data\\res.txt");
        try (Stream<String> lines = Files.newBufferedReader(path).lines()) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //В тот же класс Files добавлен статический метод lines(), возвращающий Stream из строк.
        try (Stream<String> lines = Files.lines(path)) {
            String result = lines.collect(Collectors.joining());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}