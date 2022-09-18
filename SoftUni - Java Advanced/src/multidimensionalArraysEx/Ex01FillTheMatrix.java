package multidimensionalArraysEx;

import java.util.Scanner;

public class Ex01FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(", ");
        int n = Integer.parseInt(data[0]);
        String type = data[1];
        int[][] matrix = new int[n][n];
        int currentNum = 1;
        switch (type) {
            case "A":
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[j][i] = currentNum;
                        currentNum++;
                    }
                }
                break;
            case "B":
                for(int i = 0; i < n; i++){
                    if(i % 2 == 0){
                        for(int j = 0; j < n; j++){
                            matrix[j][i] = currentNum;
                            currentNum++;
                        }
                    } else{
                        for(int j = n - 1; j >= 0; j--){
                            matrix[j][i] = currentNum;
                            currentNum++;
                        }
                    }
                }
        }
        for(int[] array: matrix){
            for(int num: array){
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
