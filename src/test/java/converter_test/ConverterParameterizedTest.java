package converter_test;

import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ConverterParameterizedTest {
    Converter converter = new Converter();

    @DataProvider(name = "celsius_3")
    public Object[][] createData() {
        return new Object[][]{{10, 50}, {0, 32}, {40, 104}};
    }

    @Test(dataProvider = "celsius_3")
    public void testParamsConvert(double celsius, double expectedFahrenheit) {
        double actual = converter.convertCelsiusToFahrenheit(celsius);
        assertEquals(actual,expectedFahrenheit, 0.001);
    }



    //для запуска данного теста нужно его запускать через xml file по другому значения не передадуться
    @Test
    @Parameters({"celsius", "expectedFahrenheit"})
    public void testConvertWithParam(double celsius, double expectedFahrenheit) {
        double actual = converter.convertCelsiusToFahrenheit(celsius);
        assertEquals(actual, expectedFahrenheit, 0.001);
    }
}