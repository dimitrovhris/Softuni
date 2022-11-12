package workingWithAbstraction.exercise.workingWithAbstractionEx.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int m = dimensions[0];
        int n = dimensions[1];

        int[][] matrix = new int[m][n];

        int value = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = value++;
            }
        }

        String command = scanner.nextLine();
        int sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] mainDiagonal = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] evilDiagonal = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = evilDiagonal[0];
            int col = evilDiagonal[1];

            while (row >= 0 && col >= 0) {
                if (row < matrix.length && col < matrix[0].length) {
                    matrix[row][col] = 0;
                }
                row--;
                col--;
            }

            int xI = mainDiagonal[0];
            int yI = mainDiagonal[1];

            while (xI >= 0 && yI < matrix[1].length) {
                if (xI < matrix.length && yI >= 0 && yI < matrix[0].length) {
                    sum += matrix[xI][yI];
                }
                yI++;
                xI--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }
}
