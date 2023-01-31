package avlyakulov.timur.epam.chapter_8.example.encryption.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

public class Base64FileEncoder {
    //шифрование файла
    public String fileEncode(String filename) throws IOException {
        try (FileInputStream input = new FileInputStream(filename)) {
            Base64.Encoder encoder = Base64.getEncoder();
            try (OutputStream output = encoder.wrap(new FileOutputStream(filename + ".encode"))) {
                int bytes;
                while ((bytes = input.read()) != -1)
                    output.write(bytes);
            }
        }
        return filename + ".encode";
    }

    public static void main(String[] args) throws IOException {
        String filename = "fileText.txt";
        Base64FileEncoder base64FileEncoder = new Base64FileEncoder();
        String res = base64FileEncoder.fileEncode(filename);
        System.out.println(res);
    }
}