package data_reader_test;

import avlyakulov.timur.epam.application_2.test.DataReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataReaderTest {
    static final String TEST_FILE = "data/celsius.txt";
    @Test(groups = "base_flow")
    public void testRead() {
        DataReader dataReader = new DataReader();
        String actual = dataReader.read(TEST_FILE);
        String expected = "0 10.1 20 a7b 36.6 45 -25 -300 7 5n.9 -888.1 -1 777";
        Assert.assertEquals(actual, expected);
    }
}
