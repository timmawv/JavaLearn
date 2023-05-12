package avlyakulov.timur.epam.chapter_10.example.files;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
        //получение из объекта файла
        File file = new File("data\\info.txt");
        Path path = file.toPath();
        System.out.println(path);
        //получение прямой инициализацией
        Path path1 = Paths.get("data\\info.txt");
        Path path2 = FileSystems.getDefault().getPath("data\\info.txt");
        System.out.println(path1);
        System.out.println(path2);
        System.out.println(FileSystems.getDefault());

        Path source = Paths.get("data/info.txt");
        Path destination = Paths.get("data/book_info.txt");
        Files.copy(source,destination);


    }
}