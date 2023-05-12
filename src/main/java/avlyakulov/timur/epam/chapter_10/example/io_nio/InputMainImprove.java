package avlyakulov.timur.epam.chapter_10.example.io_nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

// пример try-with-resources
public class InputMainImprove {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data\\info.txt")) {
            int code = fis.read();
            System.out.println(code + " char = " + (char) code);
            byte[] arr = new byte[15];
            int numberBytes = fis.read(arr);
            System.out.println("Number bytes = " + numberBytes);
            System.out.println("Our array = " + Arrays.toString(arr));
            for (byte b : arr) {
                System.out.print((char) b);
            }

        } catch (IOException e) {
            System.out.println("Can't open the stream");
        }
    }
}
