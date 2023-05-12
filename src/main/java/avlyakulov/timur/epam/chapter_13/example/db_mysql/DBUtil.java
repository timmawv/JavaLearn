package avlyakulov.timur.epam.chapter_13.example.db_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static void main(String[] args) throws ClassNotFoundException {
        String urlConnection = "jdbc:mysql://localhost:3306/example";
        String username = "root";
        String password = "1504";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(urlConnection,username,password)) {
            System.out.println("We are conncected");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}