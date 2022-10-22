package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[][] matrix = new String[n][n];
        String racingNumber = sc.nextLine();
        for (int i = 0; i < n; i++) {
            matrix[i] = sc.nextLine().split("\\s+");
        }
        String input = sc.nextLine();
        int row = 0;
        int col = 0;
        int totalDistance = 0;
        boolean isRaceOver = false;
        List<Integer> total = new ArrayList<>();
        while (!input.equals("End")) {
            if (!isRaceOver) {
                matrix[row][col] = "C";
                List<Integer> currentCoordinates = new ArrayList<>();
                int oldRow = row;
                int oldCol = col;
                switch (input) {
                    case "left":
                        currentCoordinates = moveLeft(row, col);
                        totalDistance += 10;
                        break;
                    case "right":
                        currentCoordinates = moveRight(row, col);
                        totalDistance += 10;
                        break;
                    case "up":
                        currentCoordinates = moveUp(row, col);
                        totalDistance += 10;
                        break;
                    case "down":
                        currentCoordinates = moveDown(row, col);
                        totalDistance += 10;
                        break;
                }
                row = currentCoordinates.get(0);
                col = currentCoordinates.get(1);
                matrix[oldRow][oldCol] = ".";
                if (matrix[row][col].equals("T")) {
                    oldRow = row;
                    oldCol = col;
                    matrix[oldRow][oldCol] = ".";
                    currentCoordinates = findTunnel(matrix);
                    row = currentCoordinates.get(0);
                    col = currentCoordinates.get(1);
                    totalDistance += 20;
                } else if (matrix[row][col].equals("F")) {
                    isRaceOver = true;
                }
                total = Arrays.asList(row,col);
            }
            input = sc.nextLine();
        }
        matrix[total.get(0)][total.get(1)] = "C";
        if(isRaceOver){
            System.out.printf("Racing car %s finished the stage!%n", racingNumber);
        } else{
            System.out.printf("Racing car %s DNF.%n", racingNumber);
        }
        System.out.printf("Distance covered %d km.%n", totalDistance);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length;j++){
                System.out.printf("%s", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static List<Integer> moveLeft(int row, int col) {
        col--;
        return Arrays.asList(row, col);
    }

    public static List<Integer> moveRight(int row, int col) {
        col++;

        return Arrays.asList(row, col);
    }

    public static List<Integer> moveDown(int row, int col) {
        row++;
        return Arrays.asList(row, col);
    }

    public static List<Integer> moveUp(int row, int col) {
        row--;
        return Arrays.asList(row, col);
    }

    public static List<Integer> findTunnel(String[][] matrix) {
        List<Integer> tunnelCoordinates = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("T")) {
                    tunnelCoordinates.add(i);
                    tunnelCoordinates.add(j);
                }
            }
        }
        return tunnelCoordinates;
    }
}