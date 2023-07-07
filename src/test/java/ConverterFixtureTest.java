import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConverterFixtureTest {
    Converter converter;

    @BeforeClass
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void testConverterCelsiusToFahrenheit() {
        double actual = converter.convertCelsiusToFahrenheit(10.0);
        double expected = 50.;
        assertEquals(actual, expected, 0.001, " Test failed as...");
    }

    @Test
    public void testCheckCelsius() {
        boolean condition = converter.checkCelsius(-45);
        assertTrue(condition);
    }

    @AfterClass
    public void tierDown() {
        converter = null;
    }
}