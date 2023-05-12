package avlyakulov.timur.epam.chapter_10.example.jar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnPackJar {
    private Path destinationPath;
    //buffer size when unpacking
    public static final int BUFFER = 2_048;

    public void unpack(String destinationDirectory, String nameJar) {
        try (JarFile jarFile = new JarFile(nameJar)) {
            jarFile.stream().forEach(entry -> {
                String entryName = entry.getName();
                System.out.println("Extracting: " + entry);
                destinationPath = Paths.get(destinationDirectory, entryName);
                //create directory structure
                destinationPath.getParent().toFile().mkdirs();
                // unpack the record, if it is not a directory
                if (!entry.isDirectory()) {
                    writeFile(jarFile, entry);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(JarFile jar, JarEntry entry) {
        int currentByte;
        byte[] data = new byte[BUFFER];
        try (BufferedInputStream bis =
                     new BufferedInputStream(jar.getInputStream(entry));
             FileOutputStream fos =
                     new FileOutputStream(destinationPath.toString());
             BufferedOutputStream bos =
                     new BufferedOutputStream(fos, BUFFER)) {
            //write the file to the disk
            while ((currentByte = bis.read(data, 0, BUFFER)) > 0) {
                bos.write(data, 0, currentByte);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}