package examPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReVolt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int commands = Integer.parseInt(sc.nextLine());
        char[][] matrix = new char[n][n];
        int currentRow = 0;
        int currentColumn = 0;
        for (int i = 0; i < n; i++) {
            String currentRowInput = sc.nextLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = currentRowInput.charAt(j);
                if (matrix[i][j] == 'f') {
                    currentRow = i;
                    currentColumn = j;
                    matrix[i][j] = '-';
                }
            }
        }
        while (commands-- > 0) {
            String command = sc.nextLine();
            List<Integer> fieldNums = move(command, currentRow, currentColumn, matrix);
            currentRow = fieldNums.get(0);
            currentColumn = fieldNums.get(1);
        }
        if (matrix[currentRow][currentColumn] == 'F') {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }
        matrix[currentRow][currentColumn] = 'f';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%c", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static List<Integer> move(String command, int currentRow, int currentColumn, char[][] matrix) {
        int previousRow = currentRow;
        int previousColumn = currentColumn;
        if (command.equals("down")) {
            if (currentRow != matrix.length - 1) {
                currentRow++;
            } else {
                currentRow = 0;
            }
        } else if (command.equals("up")) {
            if (currentRow != 0) {
                currentRow--;
            } else {
                currentRow = matrix.length - 1;
            }
        } else if (command.equals("right")) {
            if (currentColumn != matrix.length - 1) {
                currentColumn++;
            } else {
                currentColumn = 0;
            }
        } else {
            if (currentColumn != 0) {
                currentColumn--;
            } else {
                currentColumn = matrix.length - 1;
            }

        }
        char currentChar = matrix[currentRow][currentColumn];
        if(currentChar == 'B'){
            return move(command, currentRow, currentColumn, matrix);
        } else if(currentChar == 'T'){
            currentRow = previousRow;
            currentColumn = previousColumn;
        }
        return Arrays.asList(currentRow, currentColumn);
    }
}