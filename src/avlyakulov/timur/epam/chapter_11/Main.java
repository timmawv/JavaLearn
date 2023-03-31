package avlyakulov.timur.epam.chapter_11;

import avlyakulov.timur.epam.chapter_11.variant_a.task_1.ListReaderReverse;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("data/fileText.txt");
        new ListReaderReverse().readFromFileAndPutReverse(file);
    }
}