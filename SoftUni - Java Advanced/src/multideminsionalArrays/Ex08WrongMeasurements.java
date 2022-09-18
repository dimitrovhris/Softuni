package multideminsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08WrongMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] matrix = new int[n][];
        for(int i = 0; i < n; i++){
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[] wrongData = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int wrongNum = matrix[wrongData[0]][wrongData[1]];
        int[][] newMatrix = new int[n][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int totalSum = matrix[i][j];
                if(matrix[i][j] == wrongNum){
                    totalSum = 0;
                    if(j > 0 && matrix[i][j-1] != wrongNum){
                        totalSum += matrix[i][j-1];
                    }
                    if(j < matrix[i].length-1 && matrix[i][j+1] != wrongNum){
                        totalSum += matrix[i][j+1];
                    }
                    if(i > 0 && matrix[i - 1][j] != wrongNum){
                        totalSum += matrix[i - 1][j];
                    }
                    if(i < matrix.length-1 && matrix[i+1][j] != wrongNum){
                        totalSum += matrix[i+1][j];
                    }
                }
                newMatrix[i][j] = totalSum;
            }
        }
        for(int[] array: newMatrix){
            for(int i = 0; i < array.length; i++){
                System.out.printf("%d ", array[i]);
            }
            System.out.println();
        }
    }
}
