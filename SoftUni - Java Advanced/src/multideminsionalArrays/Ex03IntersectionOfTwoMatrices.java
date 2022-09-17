package multideminsionalArrays;

import java.util.Scanner;

public class Ex03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        char[][] matrix1 = new char[rows][cols];
        char[][] matrix2 = new char[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix1[i][j] = sc.next().charAt(0);
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix2[i][j] = sc.next().charAt(0);
            }
        }
        for(int r = 0; r < rows; r++){
            char[] firstArr = matrix1[r];
            char[] secondArr = matrix2[r];
            for(int i = 0; i <= firstArr.length-1; i++){
                System.out.print(firstArr[i] == secondArr[i] ? firstArr[i] + " " : "* ");
            }
            System.out.println();
        }
    }
}
