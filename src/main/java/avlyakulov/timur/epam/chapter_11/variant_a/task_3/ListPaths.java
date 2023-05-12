package avlyakulov.timur.epam.chapter_11.variant_a.task_3;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

//Создать список из элементов каталога и его подкаталогов.
public class ListPaths {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("src");
        int maxDepth = 3;
        if (Files.exists(path) && Files.isDirectory(path)) {
            try (Stream<Path> streamDir = Files.walk(path, maxDepth)) { //walk позволяет посмотреть все файлы без дополнительных условий
                List<Path> list = streamDir.toList();
                System.out.println(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}