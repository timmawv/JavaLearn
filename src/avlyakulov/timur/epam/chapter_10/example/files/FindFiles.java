package avlyakulov.timur.epam.chapter_10.example.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//найдем все файлы с расширением .java
public class FindFiles {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("src");
        if (Files.exists(path) && Files.isDirectory(path)) {
            int maxDepth = 5;
            try (Stream<Path> streamDir = Files.find(path, maxDepth, (file, a) -> String.valueOf(file).endsWith(".java"))) {
                //find - позволяет посмотреть все файлы в указаном пути, и проверить их на какое то условие
                long counter = streamDir
                        .peek(System.out::println)
                        .count();
                System.out.println("found: " + counter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
