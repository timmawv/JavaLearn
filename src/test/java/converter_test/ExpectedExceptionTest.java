package converter_test;

import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ExpectedExceptionTest {
    Converter converter;

    @BeforeClass
    public void setUp() {
        converter = new Converter();
    }

    @Test(enabled = true, expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "error data")
    public void testConvertCelsiusToFahrenheitException() {
        converter.convertCelsiusToFahrenheit(-300);
    }

    //метод тестирования сообщения в исключении после его генерации
    @Test
    public void testConvertCelsiusToFahrenheit() {
        double celsius = -300;
        try {
            converter.convertCelsiusToFahrenheit(celsius);
            fail("Test for celsius " + celsius + " should have thrown a IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("error data", e.getMessage());
        }
    }


    @AfterClass
    public void tierDown() {
        converter = null;
    }
}
