import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class StaticDataProvider {
    Converter converter = new Converter();


    @DataProvider(name = "dataProviderArray")
    public static Object[][] createData() {
        return new Object[][]{{0.0, 32.0}, {10, 50.0}, {20, 68}};
    }

    @DataProvider(name = "dataProviderIterator")
    public static Iterator<Object[]> createIterator() {
        Object[][] ob = new Object[][]{{5, 41}, {15, 59}, {30, 86}};
        List<Object[]> list = List.of(ob);
        return list.iterator();
    }

    @Test(dataProvider = "dataProviderArray", dataProviderClass = StaticDataProvider.class)
    public void testConvertCelsiusArray(double in, double expected) {
        double actual = converter.convertCelsiusToFahrenheit(in);
        Assert.assertEquals(actual, expected);
    }
    @Test(dataProvider = "dataProviderIterator", dataProviderClass = StaticDataProvider.class)
    public void testConvertCelsiusIterator(double in, double expected) {
        double actual = converter.convertCelsiusToFahrenheit(in);
        Assert.assertEquals(actual, expected);
    }
}