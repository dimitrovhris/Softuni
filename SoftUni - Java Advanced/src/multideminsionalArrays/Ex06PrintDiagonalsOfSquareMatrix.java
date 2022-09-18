package multideminsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] square = new int[n][n];
        int row = 0;
        int col = 0;
        for(int i = 0; i < n; i++){
            square[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        while(row < square.length && col < square.length){
            System.out.print(square[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();
        row = square.length - 1;
        col = 0;
        while(row >= 0 && col < square.length){
            System.out.print(square[row][col] + " ");
            row--;
            col++;
        }
    }
}
