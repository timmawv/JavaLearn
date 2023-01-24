package avlyakulov.timur.epam.chapter_8.example.internationalization.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatMain {
    //региональные представления дат
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.MEDIUM, new Locale("uk", "UK"));
        String dateStr = dateFormat.format(new Date());
        System.out.println(dateStr);
        try {
            Date date = dateFormat.parse(dateFormat.format(new Date()));
            System.out.println(date);
            DateFormat dateFormatCa = DateFormat.getDateTimeInstance(
                    DateFormat.SHORT, DateFormat.SHORT, Locale.CANADA);
            System.out.println(dateFormatCa.format(date));
            DateFormat dateFormatFr = DateFormat.getDateTimeInstance(
                    DateFormat.SHORT, DateFormat.SHORT, Locale.FRANCE);
            System.out.println(dateFormatFr.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date = new Date();
        Locale[] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + format.format(date));
        }
    }
}
