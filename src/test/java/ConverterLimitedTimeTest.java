import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class ConverterLimitedTimeTest {
    Converter converter = new Converter();


    @Test(timeOut = 250)
    public void testTimeCycle() {
        for (int t = -273; t < 100_000_000; t++) {
            converter.convertCelsiusToFahrenheit(t);
        }
    }
    @Test(timeOut = 1_000)
    public void testTimeStream() {
        IntStream.range(-273, 100_000_000)
                .boxed()
                .forEach(t -> converter.convertCelsiusToFahrenheit(t));
    }
}