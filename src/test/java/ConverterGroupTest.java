import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ConverterGroupTest {
    Converter converter;

    @BeforeGroups(groups = {"calc", "check"})
    public void setUp() {
        converter = new Converter();
    }

    @Test(groups = "calc")
    @Parameters({"celsius", "expectedFahrenheit"})
    public void testConvertWithParam(double celsius, double expectedFahrenheit) {
        double actual = converter.convertCelsiusToFahrenheit(celsius);
        assertEquals(actual, expectedFahrenheit, 0.001);
    }

    @Test(groups = {"calc", "check"}, timeOut = 1_000)
    public void testTime() {
        for (int i = 0; i < 100_000_000; ++i) {
            converter.convertCelsiusToFahrenheit(i);
        }
    }

    @Test(groups = {"calc"})
    public void testConvertCelsiusToFahrenheit() {
        double actual = converter.convertCelsiusToFahrenheit(10.0);
        double expected = 551.;// failed value
        assertEquals(actual, expected, 0.001, " Test failed as...");
    }

    @Test(groups = {"check"}, expectedExceptions = IllegalArgumentException.class)
    public void testConvertCelsiusToFahrenheitException() {
        converter.convertCelsiusToFahrenheit(-300);
    }

    @Test(groups = {"check"})
    public void testCheckCelsius() {
        boolean condition = converter.checkCelsius(-45);
        assertTrue(condition);
    }
}