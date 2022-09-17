package multideminsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sizes = sc.nextLine();
        int[][] matrix = newMatrix(sizes);
        for(int i = 0; i < matrix.length; i++){
            int[] currentElements = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = currentElements;
        }
        int totalSum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                totalSum += anInt;
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[1].length);
        System.out.println(totalSum);
    }
    public static int[][] newMatrix (String sizes){
        int[] data = Arrays.stream(sizes.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = data[0];
        int cols = data[1];
        return new int[rows][cols];
    }
}
