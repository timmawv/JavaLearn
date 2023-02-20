package avlyakulov.timur.epam.chapter_9.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CatchFinal {
    public double parseFile(String filename) throws FileNotFoundException, ParseException, IOException {
        NumberFormat formatFrance = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = 0;
        BufferedReader bufferedReader = null;
        try {
            FileReader reader = new FileReader(filename);
            bufferedReader = new BufferedReader(reader);
            String number = bufferedReader.readLine();
            numFrance = formatFrance.parse(number).doubleValue();
        } catch (final Exception e) { //final - optional
            throw e; // more precise rethrow
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
        return numFrance;
    }
}
