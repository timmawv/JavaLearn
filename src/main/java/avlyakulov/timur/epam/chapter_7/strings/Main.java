package avlyakulov.timur.epam.chapter_7.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your first string ");
            String s1 = reader.readLine();
            System.out.println("Enter your second string ");
            String s2 = reader.readLine();
            CheckLengthString checkStrings = (str,str2) -> str.length() > str2.length() ? str : str2;
            String result = checkStrings.checkLengthString(s1,s2);
            System.out.println("This strings is longer " + result);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("You enter the wrong value " + e.getMessage());
        }
    }
}
