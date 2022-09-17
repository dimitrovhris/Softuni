package multideminsionalArrays;

import java.util.Scanner;

public class Ex02PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean isFound = false;
        int num = sc.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == num){
                    isFound = true;
                    System.out.println(i + " " + j);
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }
    }
}
