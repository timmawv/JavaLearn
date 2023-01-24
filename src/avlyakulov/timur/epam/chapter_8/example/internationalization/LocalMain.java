package avlyakulov.timur.epam.chapter_8.example.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalMain {
    public static void main(String[] args) {
        Locale bel1 = new Locale("uk");//language
        Locale bel2 = new Locale("uk","UA");//language and country
        Locale current = Locale.getDefault();
        System.out.println(bel2.getCountry());//region code
        System.out.println(bel2.getDisplayCountry());//region name
        System.out.println(bel2.getLanguage());//region language code
        System.out.println(bel2.getDisplayLanguage());//region language name
        ResourceBundle rb = ResourceBundle.getBundle("text",bel2);
    }
}
