package avlyakulov.timur.epam.chapter_9.example;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseFrom {
    public double parseFromFrance(String numberStr) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = 0;
        try {
            numFrance = format.parse(numberStr).doubleValue();
        } catch (ParseException e) {//checked exception
            // 1. throwing a standard exception,: IllegalArgumentException() — not very good
            // 2. throwing a custom exception, where ParseException as a parameter
            // 3. setting the default value - if possible
            // 4. logging if an exception is unlikely
        }
        return numFrance;
    }

    public double parseFromFranceThrowable(String numberStr) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = format.parse(numberStr).doubleValue();
        return numFrance;
    }
}