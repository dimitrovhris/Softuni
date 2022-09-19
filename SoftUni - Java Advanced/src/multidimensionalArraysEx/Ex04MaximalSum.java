package multidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrix = new int[rows][cols];
        int[][] validMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < rows; i++){
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[] array = new int[9];
        for(int i = 1; i < rows - 1; i++){
            for(int j = 1; j < cols-1; j++){

                array[0] = matrix[i - 1][j-1];
                array[1] = matrix[i - 1][j];
                array[2] = matrix[i+1][j+1];
                array[3] = matrix[i][j-1];
                array[4] = matrix[i][j];
                array[5] = matrix[i][j + 1];
                array[6] = matrix[i+1][j - 1];
                array[7] = matrix[i + 1][j];
                array[8] = matrix[i - 1][j + 1];
                int totalSum = 0;
                for(int num: array){
                    totalSum += num;
                }
                if(totalSum > maxSum){
                    maxSum = totalSum;
                    int index = 0;
                    for(int r = 0; r < 3; r++){
                        for(int c = 0; c < 3; c++){
                            validMatrix[r][c] = array[index];
                            index++;
                        }
                    }
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        for(int[] arrays: validMatrix){
            for(int num: arrays){
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }

}
