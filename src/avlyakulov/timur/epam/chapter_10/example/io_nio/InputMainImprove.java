package avlyakulov.timur.epam.chapter_10.example.io_nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

// пример try-with-resources
public class InputMainImprove {
    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream("data\\info.txt")) {
            int code = is.read();
            System.out.println(code + " char = " + (char) code);
            byte[] arr = new byte[15];
            int numberBytes = is.read(arr);
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
