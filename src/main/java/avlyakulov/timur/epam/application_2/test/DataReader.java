package avlyakulov.timur.epam.application_2.test;

import java.io.IOException;
import java.nio.file.*;

public class DataReader {
    public String read(String filename) {
        String data = null;
        Path path = Paths.get(filename);
        if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
            try {
                StringBuilder builder = new StringBuilder();
                data = Files.lines(path).reduce((s1, s2) -> s1 + " " + s2).orElse("empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
