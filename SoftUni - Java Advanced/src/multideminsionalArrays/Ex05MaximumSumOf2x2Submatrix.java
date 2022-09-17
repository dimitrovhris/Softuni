package multideminsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = newMatrix(sc.nextLine());
        for (int i = 0; i < matrix.length; i++) {
            int[] currentRow = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = currentRow;
        }
        int maxSum = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int num1 = matrix[i][j];
                int num2 = matrix[i][j + 1];
                int num3 = matrix[i + 1][j];
                int num4 = matrix[i + 1][j + 1];
                int total = num1 + num2 + num3 + num4;
                if(total > maxSum){
                    maxSum = total;
                    max1 = num1; max2 = num2; max3 = num3; max4 = num4;
                }
            }
        }
        System.out.println(max1 + " " + max2);
        System.out.println(max3 + " " + max4);
        System.out.println(maxSum);
    }

    public static int[][] newMatrix(String sizes) {
        int[] data = Arrays.stream(sizes.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return new int[data[0]][data[1]];
    }
}
