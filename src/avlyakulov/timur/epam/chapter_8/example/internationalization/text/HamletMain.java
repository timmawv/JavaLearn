package avlyakulov.timur.epam.chapter_8.example.internationalization.text;

import java.io.IOException;
import java.util.Locale;


public class HamletMain {
    //поддержка различных языков
    public static void main(String[] args) {
        System.out.println("1 - eng\n2 - ukr\n3 - default");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1' -> {
                language = "en";
                country = "US";
            }
            case '2' -> {
                language = "uk";
                country = "UA";
            }
            default -> System.out.println("You are fucking dubm look at u idiot");
        }
        Locale current = new Locale(language, country);
        String s1 = MessageManager.EN.getString("str1");
        System.out.println(s1);
        String s2 = MessageManager.EN.getString("str2");
        System.out.println(s2);
    }
}