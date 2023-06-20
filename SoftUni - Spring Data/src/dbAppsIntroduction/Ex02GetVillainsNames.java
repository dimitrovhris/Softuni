package dbAppsIntroduction;

import java.sql.*;
import java.util.Properties;

public class Ex02GetVillainsNames {
    static String GET_NAMES = "SELECT name, COUNT(villain_id) AS minions_count FROM minions_villains as mv\n" +
            "JOIN villains AS v ON mv.villain_id = v.id\n" +
            "GROUP BY villain_id\n" +
            "HAVING minions_count > ?;";
    public static void main(String[] args) throws SQLException {
        Connection connection = Utils.getSqlConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(GET_NAMES);
        preparedStatement.setInt(1, 15);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            String name = resultSet.getString("name");
            int count_of_minions = resultSet.getInt("minions_count");
            System.out.println(name + count_of_minions);
        }
        connection.close();

    }
}
