package javaAdvancedExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] matrix = new String[n][n];
        for(int i = 0; i < n; i++){
            matrix[i] = sc.nextLine().split("");
        }
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("S")) {
                    startRow = i;
                    startCol = j;
                    matrix[i][j] = "-";
                }
            }
        }
        int totalMoney = 0;
        int currentRow = startRow;
        int currentCol = startCol;
        while (totalMoney < 50) {
            String command = sc.nextLine();
            switch (command) {
                case "right":
                    currentCol++;
                    break;
                case "left":
                    currentCol--;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
            }
            if (personIsInVoid(currentRow, currentCol, n)) {
                break;
            }
            if (personIsOnANumber(currentRow, currentCol, matrix)) {
                int number = Integer.parseInt(matrix[currentRow][currentCol]);
                matrix[currentRow][currentCol] = "-";
                totalMoney += number;
            }
            if (personIsOnAPillar(currentRow, currentCol, matrix)) {
                matrix[currentRow][currentCol] = "-";
                List<Integer> indexes = secondPillarIndexes(matrix);
                currentRow = indexes.get(0);
                currentCol = indexes.get(1);
                matrix[currentRow][currentCol] = "-";
            }
        }
        if (!personIsInVoid(currentRow, currentCol, n)) {
            matrix[currentRow][currentCol] = "S";
            System.out.println("Good news! You succeeded in collecting enough money!");
        } else{
            System.out.println("Bad news, you are out of the bakery.");
        }
        System.out.println("Money: " + totalMoney);
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean personIsInVoid(int currentRow, int currentCol, int n) {
        return currentRow >= n || currentCol >= n;
    }

    private static boolean personIsOnANumber(int currentRow, int currentCol, String[][] matrix) {
        char currentSymbol = matrix[currentRow][currentCol].charAt(0);
        return Character.isDigit(currentSymbol);
    }

    private static boolean personIsOnAPillar(int currentRow, int currentCol, String[][] matrix) {
        String currentSymbol = matrix[currentRow][currentCol];
        return currentSymbol.equals("O");
    }

    private static List<Integer> secondPillarIndexes(String[][] matrix) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("O")) {
                    indexes.add(i);
                    indexes.add(j);
                    return indexes;
                }
            }
        }
        return null;
    }
}
