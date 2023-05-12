package avlyakulov.timur.epam.chapter_10.example.files;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

//найдем просто все файлы с помощью метода walk()
public class FindFilesWalk {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("src");
        int maxDepth = 2;
        if (Files.exists(path) && Files.isDirectory(path)) {
            try (Stream<Path> streamDir = Files.walk(path, maxDepth)) { //walk позволяет посмотреть все файлы без дополнительных условий
                long counter = streamDir
                        .peek(System.out::println)
                        .count();
                System.out.println(counter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}