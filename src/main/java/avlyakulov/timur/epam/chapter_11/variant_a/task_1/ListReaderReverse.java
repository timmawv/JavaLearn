package avlyakulov.timur.epam.chapter_11.variant_a.task_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

/* Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке. */
public class ListReaderReverse {
    public File readFromFileAndPutReverse(File file) {
        File newFile = new File("data/res.txt");
        List<String> linesFile;
        try (Stream<String> lines = Files.lines(file.toPath());
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            linesFile = lines.toList();
            ListIterator<String> iterator = linesFile.listIterator(linesFile.size());
            while (iterator.hasPrevious()) {
                writer.write(iterator.previous() + '\n');
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFile;
    }
}