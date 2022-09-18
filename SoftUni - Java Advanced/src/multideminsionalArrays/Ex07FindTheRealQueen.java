package multideminsionalArrays;

import java.util.Scanner;

public class Ex07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = new char[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                char currentChar = matrix[row][col];
                if (currentChar == 'q' && horizontal(row, matrix) && vertical(col, matrix) && diagonal1(row, col, matrix) && diagonal2(row, col, matrix) &&
                        diagonal3(row, col, matrix) && diagonal4(row, col, matrix)) {
                    System.out.printf("%d %d", row, col);
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
    }

    public static boolean diagonal1(int row, int col, char[][] matrix) {
        int q = 0;
        while (row >= 0 && col >= 0) {
            if (matrix[row][col] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
            row--;
            col--;
        }
        return true;
    }

    public static boolean diagonal2(int row, int col, char[][] matrix) {
        int q = 0;
        while (row >= 0 && col < matrix.length) {

            if (matrix[row][col] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
            row--;
            col++;
        }
        return true;
    }

    public static boolean diagonal3(int row, int col, char[][] matrix) {
        int q = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
            row++;
            col--;
        }
        return true;
    }

    public static boolean diagonal4(int row, int col, char[][] matrix) {
        int q = 0;
        while (row < matrix.length && col < matrix.length) {
            if (matrix[row][col] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
            row++;
            col++;
        }
        return true;
    }

    public static boolean horizontal(int row, char[][] matrix) {
        int q = 0;
        for (int i = 0; i < 8; i++) {
            if (matrix[row][i] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
        }
        return true;
    }

    public static boolean vertical(int col, char[][] matrix) {
        int q = 0;
        for (int i = 0; i < 8; i++) {
            if (matrix[i][col] == 'q') {
                q++;
                if (q > 1)
                    return false;
            }
        }
        return true;
    }
}
