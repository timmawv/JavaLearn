package avlyakulov.timur.epam.chapter_11.example.property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoadDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.load(new FileReader("datares/base.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dbUrl = props.getProperty("db.url");
        // following two names are missing in the file
        String maxIdle = props.getProperty("maxIdle"); // maxIdle = null
        // value "20" will be assigned to the key if it is not found in the file
        String maxActive = props.getProperty("maxActive", "20");
        System.out.println("dbUrl: " + dbUrl);
        System.out.println("maxIdle: " + maxIdle);
        System.out.println("maxActive: " + maxActive);
    }
}
