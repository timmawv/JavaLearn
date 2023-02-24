package avlyakulov.timur.epam.chapter_10.example.files;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        File file4 = new File("\\com\\file.txt"); // создается на основе файла
        File dir = new File("c:/jdk/src/java/io"); // создается на основе каталога
        File file1 = new File(dir, "File.java");
        File file2 = new File("c:\\com", "file.txt");
        //кодга неизвестно в какой системе будет запускаться код, то мы используем поля в классе File
        // В системе Unix -" / "
        // В системе Windows -" \\ "
        File file3 = new File(File.separator + "com" + File.separator + "data.txt");
        File file = new File("data");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getFreeSpace());
    }
}
