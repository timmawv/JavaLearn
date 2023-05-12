package avlyakulov.timur.epam.chapter_8.example.internationalization;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Locale localeUa = new Locale("uk","UA");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,localeUa);
        System.out.println(dateFormat.format(date));
    }
}