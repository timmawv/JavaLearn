package converter_test;

import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ConverterTest {
    Converter converter = new Converter();

    @Test()
    public void testConvertCelsiusToFahrenheit() {
        double actual = converter.convertCelsiusToFahrenheit(10.0);
        double expected = 50.;
        assertEquals(actual, expected, 0.001, " Test failed as...");
    }

    @Test
    public void checkSameTest() {
        String actual = "java" + 17;
        String expected = "ja" + "va" + 17;
        Assert.assertSame(actual, expected);
    }
    @Test
    public void testCheckCelsiusFalse() {
        Converter converter1 = new Converter();
        boolean condition = converter1.checkCelsius(-300);
        Assert.assertFalse(condition, "test false failed as...");
    }
}