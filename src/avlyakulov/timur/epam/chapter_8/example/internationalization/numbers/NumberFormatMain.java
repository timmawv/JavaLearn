package avlyakulov.timur.epam.chapter_8.example.internationalization.numbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMain {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMAN);
        String source = "1.234,567";
        NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            double number = numberFormat.parse(source).doubleValue();
            System.out.println(number);
            String resultUs = numberFormatUs.format(number);
            System.out.println("US(number): " + resultUs);
            String resultFr = numberFormatFr.format(number);
            System.out.println("FR(number): " + resultFr);
            double numberUs = numberFormatUs.parse(source).doubleValue();
            System.out.println("DE -> US(parse number): " + numberUs);
            double numberFr = numberFormatFr.parse(source).doubleValue();
            System.out.println("DE -> FR(parse number): " + numberFr);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}