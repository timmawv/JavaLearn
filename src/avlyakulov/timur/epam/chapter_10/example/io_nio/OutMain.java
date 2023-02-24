package avlyakulov.timur.epam.chapter_10.example.io_nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//вывод массива в поток в виде символов и байт
public class OutMain {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("data\\out.txt", true)) {
            outputStream.write(48);
            byte[] arr = {65,78,100};
            outputStream.write(arr);
        } catch (FileNotFoundException e) {
            System.err.println("Can't found file");
        } catch (IOException e) {
            System.err.println("Stream has problem");
        }
    }
}
