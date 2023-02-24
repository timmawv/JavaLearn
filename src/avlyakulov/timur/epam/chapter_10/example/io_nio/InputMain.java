package avlyakulov.timur.epam.chapter_10.example.io_nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

//чтение одного символа (байта) и массива из потока ввода # InputMain.java
public class InputMain {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("data\\info.txt");
            int code = input.read();
            System.out.println(code + " char = " + (char) code);
            byte[] arr = new byte[16];
            int numberBytes = input.read(arr);
            System.out.println("number bytes = " + numberBytes);
            System.out.println(Arrays.toString(arr));
            for (byte b : arr)
                if (b != 0)
                    System.out.print((char) b);

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("The stream has problem");
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (IOException e) {
                System.out.println("Can't close stream");
            }
        }
    }
}
