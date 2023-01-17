package avlyakulov.timur.epam.chapter_7.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

/*
Написать программу, которая выводит число прописью.
 */
public class IntToString {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your num to convert it to String");
            int num = Integer.parseInt(reader.readLine());
            Function<Integer,String> convertIntToStr = t -> t.toString();
            String numStr = convertIntToStr.apply(num);
            System.out.println("Your num " + numStr);
        }
        catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
