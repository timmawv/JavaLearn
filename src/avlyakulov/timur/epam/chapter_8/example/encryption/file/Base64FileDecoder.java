package avlyakulov.timur.epam.chapter_8.example.encryption.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

public class Base64FileDecoder {
    //расшифровка файла
    public String fileDecode (String filenameEncode) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filenameEncode  + ".decode")) {
            Base64.Decoder decoder = Base64.getDecoder();
            try (InputStream input = decoder.wrap(new FileInputStream(filenameEncode))) {
                int bytes;
                while ((bytes = input.read()) != -1)
                    fos.write(bytes);
            }
        }
        return filenameEncode + ".decode";
    }

    public static void main(String[] args) throws IOException {
        String filenameEncode = "fileText.txt.encode";
        Base64FileDecoder decoder = new Base64FileDecoder();
        String result = decoder.fileDecode(filenameEncode);
        System.out.println(result);
    }
}
