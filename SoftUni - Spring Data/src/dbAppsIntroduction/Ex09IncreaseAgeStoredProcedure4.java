package dbAppsIntroduction;

import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex09IncreaseAgeStoredProcedure4 {

    private static final String CALL_INCREASE_PROCEDURE = "CALL usp_get_older(?)";
    private static final String PRINT_MINION_AGE = "SELECT name, age FROM minions as m WHERE m.id = ?;";

    public static void main(String[] args) throws SQLException {
        final Scanner sc = new Scanner(System.in);
        final Connection sqlConnection = Utils.getSqlConnection();
        int inputId = Integer.parseInt(sc.nextLine());

        PreparedStatement callProcedureStatement = sqlConnection.prepareStatement(CALL_INCREASE_PROCEDURE);
        callProcedureStatement.setInt(1, inputId);
        callProcedureStatement.executeUpdate();

        PreparedStatement printMinionAgeStatement = sqlConnection.prepareStatement(PRINT_MINION_AGE);
        printMinionAgeStatement.setInt(1, inputId);
        ResultSet resultSet = printMinionAgeStatement.executeQuery();
        while(resultSet.next()){
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println(name);
            System.out.println(age);
        }
    }
}
