package dbAppsIntroduction;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Utils.getSqlConnection();
        connection.close();

    }
}
