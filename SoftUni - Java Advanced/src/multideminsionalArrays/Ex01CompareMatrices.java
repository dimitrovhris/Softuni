package multideminsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraysCount = sc.nextInt();
        int arraySize = sc.nextInt();
        int[][] firstMatrix = new int[arraysCount][arraySize];
        for(int i = 0; i < arraysCount; i++){
            for(int j = 0; j < arraySize; j++){
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        int arraysCount2 = sc.nextInt();
        int arraySize2 = sc.nextInt();
        int[][] secondMatrix = new int[arraysCount2][arraySize2];
        for(int i = 0; i < arraysCount2; i++){
            for(int j = 0; j < arraySize2; j++){
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(areEqual(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }
    public static boolean areEqual(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length){
            return false;
        }
        for(int r = 0; r < matrix1.length; r++){
            int[] firstArr = matrix1[r];
            int[] secondArr = matrix2[r];
            if(firstArr.length != secondArr.length){
                return false;
            }
            for(int i = 0; i < firstArr.length; i++){
                if(firstArr[i] != secondArr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
