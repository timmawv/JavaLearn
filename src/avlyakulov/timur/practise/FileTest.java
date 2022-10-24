package avlyakulov.timur.practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        String path = "D:\\Загрузки\\testFile.txt";
        File file = new File(path);
        PrintWriter pw;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        pw.println("1 line of our example");
        pw.print("2 line");
        pw.println(" at the same line ");
        pw.close();
        String str = " ";
        Scanner sc;
        try {
             sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNextLine())
             str += sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}
