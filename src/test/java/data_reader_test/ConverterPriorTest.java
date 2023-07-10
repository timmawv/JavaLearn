package data_reader_test;

import avlyakulov.timur.epam.application_2.test.Converter;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ConverterPriorTest {
    Converter converter;

    @BeforeGroups(groups = "base_flow")
    public void setUp() {
        converter = new Converter();
    }

    @Test(dataProvider = "celsius_9", groups = "base_flow")
    public void testParamConvert(double celsius, double expectedFahrenheit) {
        double actual = converter.convertCelsiusToFahrenheit(celsius);
        assertEquals(actual, expectedFahrenheit, 0.001);
    }

    @Test(timeOut = 250, groups = "base_flow")
    public void testTime() {
        for (int t = -273; t < 100_000_000; ++t) {
            converter.convertCelsiusToFahrenheit(t);
        }
    }

    //dependsOnMethods показывает, что если мы не смогли выполнить тот метод, то этот просто выполняться не будет, 1 зависим от 2
    @Test(dependsOnMethods = {"testTime"},dataProvider = "celsius_check_10", groups = "base_flow")
    public void testCheckCelsius(double celsius, boolean flag) {
        boolean condition = converter.checkCelsius(celsius);
        assertTrue(condition == flag);
    }

    @DataProvider(name = "celsius_9")
    public Object[][] createData() {
        return new Object[][]{
                {0.0, 32.0},
                {10.1, 50.18},
                {20.0, 68.0},
                {36.6, 97.88},
                {45.0, 113.0},
                {-25.0, -13.0},
                {7.0, 44.6},
                {-1.0, 30.2},
                {777.0, 1430.6}};
    }

    @DataProvider(name = "celsius_check_10")
    public Object[][] createDataCheck() {
        return new Object[][]{
                {0.0, true},
                {10.1, true},
                {20.0, true},
                {36.6, true},
                {45.0, true},
                {-25.0, true},
                {7.0, true},
                {-888.1, false},
                {-1.0, true},
                {777.0, true}};
    }
}