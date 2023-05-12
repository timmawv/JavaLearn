package avlyakulov.timur.epam.chapter_8.example.internationalization.numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("uk","UA"));
        System.out.println(numberFormat);
        System.out.println(NumberFormat.getInstance());

    }
}
