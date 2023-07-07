
import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConverterParameterizedTest {
    Converter converter = new Converter();

    @DataProvider(name = "celsius_3")
    public Object[][] createData() {
        return new Object[][]{{10, 50}, {0, 32}, {40, 104}};
    }

    @Test(dataProvider = "celsius_3")
    public void testParamsConvert(double celsius, double expectedFahrenheit) {
        double actual = converter.convertCelsiusToFahrenheit(celsius);
        Assert.assertEquals(actual,expectedFahrenheit, 0.001);
    }
}
