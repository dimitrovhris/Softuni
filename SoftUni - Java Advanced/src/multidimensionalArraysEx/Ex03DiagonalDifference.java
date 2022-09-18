package multidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[n][n];
        for(int i = 0; i < matrix.length; i++){
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int firstSum = 0;
        int secondSum = 0;

        int row = 0;
        int col = 0;
        while(row < matrix.length && col < matrix.length){
            firstSum += matrix[row][col];
            row++;
            col++;
        }
        row = 0;
        col = matrix.length - 1;
        while(row < matrix.length && col >= 0){
            secondSum+= matrix[row][col];
            row++;
            col--;
        }
        System.out.println(Math.abs(firstSum - secondSum));
    }
}
