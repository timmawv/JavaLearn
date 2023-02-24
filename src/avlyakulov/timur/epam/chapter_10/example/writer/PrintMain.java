package avlyakulov.timur.epam.chapter_10.example.writer;

import java.io.*;

public class PrintMain {
    public static void main(String[] args) {
        double[] values = {1.10, 1.2};
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("data\\r.txt")))) {
            for (double d : values) {
                writer.printf("Java %.1f\n", d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //example with stream
        double[] values1 = {14.10, 17};
        try (PrintStream stream = new PrintStream(new FileOutputStream("data\\res.txt"))) {
            for (double value: values) {
                stream.printf("Java %.2g%n", value);
                System.setOut(stream);
                System.out.printf("%.2g%n", value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}