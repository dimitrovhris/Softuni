package dbAppsIntroduction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03GetMinionNames {
    static String GET_VILLAIN_AND_MINIONS = "SELECT DISTINCT villain_id, v.name AS villain_name, m.name AS minion_name, age FROM minions_villains as mv\n" +
            "JOIN villains v ON mv.villain_id = v.id\n" +
            "JOIN minions m on mv.minion_id = m.id\n" +
            "WHERE villain_id = ?;";

    static String GET_VILLAIN_NAME = "SELECT name FROM villains AS v\n" +
            "WHERE v.id = ?\n" +
            "LIMIT 1;";
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int inputId = Integer.parseInt(sc.nextLine());

        Connection connection = Utils.getSqlConnection();

        PreparedStatement firstStatement = connection.prepareStatement(GET_VILLAIN_NAME);
        firstStatement.setInt(1, inputId);
        ResultSet firstSet = firstStatement.executeQuery();
        String villain_name = "";
        while(firstSet.next()){
        villain_name = firstSet.getString("name");}

        PreparedStatement finalStatement = connection.prepareStatement(GET_VILLAIN_AND_MINIONS);
        finalStatement.setInt(1, inputId);

        ResultSet resultSet = finalStatement.executeQuery();
        if(inputId <= 6) {
            System.out.printf("Villain: %s", villain_name);
            System.out.println();
            for (int i = 1; resultSet.next(); i++) {
                System.out.printf("%d. %s %d%n", i, resultSet.getString("minion_name"), resultSet.getInt("age"));
            }
        } else{
            System.out.printf("No villain with ID %d exists in the database.", inputId);
        }

    }
}
