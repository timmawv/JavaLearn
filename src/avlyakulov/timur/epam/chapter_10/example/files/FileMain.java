package avlyakulov.timur.epam.chapter_10.example.files;


import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;

public class FileMain {
    //работа с файловой системой
    public static void main(String[] args) {
        System.out.println(Arrays.toString(File.listRoots()));
        File file = new File("data" + File.separator + "info.txt");
        if (file.exists() && file.isFile()) {
            System.out.println("Path of file " + file.getPath());
            System.out.println("Absolute Path of file " + file.getAbsolutePath());
            System.out.println("Size of file " + file.length());
            System.out.println("Directory of file " + file.getParent());
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File dir = new File("data");
        if (dir.exists() && dir.isDirectory()) {
            for (File current : dir.listFiles()) {
                long millis = current.lastModified();
                Instant date = Instant.ofEpochMilli(millis);
                System.out.println(current.getPath() + "\t" + current.length() + "\t" + date);
            }
            File root = File.listRoots()[0];
            System.out.printf("\n%s %,d from %,d free bytes", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
        }
    }
}