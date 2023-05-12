package avlyakulov.timur.epam.chapter_8.example.internationalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LangTest {
    public static void main(String[] args) {
        ResourceBundle bundleUa = ResourceBundle.getBundle("text", new Locale("uk", "UA"));
        System.out.println(bundleUa.getString("str1"));
        System.out.println(bundleUa.getString("str2"));
        System.out.println("Number Format");
        Locale localeUa = new Locale("uk", "UA");
        double number = 21234.567;
        System.out.println(number);
        NumberFormat format = NumberFormat.getInstance(localeUa);
        System.out.println("Наше число в текущей UA Locale " + format.format(number));
        System.out.println("Наше число в дефолтной локале");
        format = NumberFormat.getInstance();
        System.out.println("Наше число в текущей default Locale " + format.format(number));
        Locale localeFr = Locale.FRANCE;
        format = NumberFormat.getInstance(localeFr);
        System.out.println("Наше число в текущей FR Locale " + format.format(number));
        Locale localeGr = Locale.GERMAN;
        format = NumberFormat.getInstance(localeGr);
        System.out.println("Наше число в текущей Germany Locale " + format.format(number));
        Locale locale = new Locale("uk","UA");
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }
}