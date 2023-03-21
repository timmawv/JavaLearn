package avlyakulov.timur.epam.chapter_11.example.property;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesStoreMain {
    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            props.setProperty("db.driver", "com.mysql.cj.jdbc.Driver");
            props.setProperty("user", "root");
            props.setProperty("password", "pass");
            props.setProperty("poolsize", "5");
            props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
            props.store(new FileWriter("datares/base.properties"), "No Comment’s");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}