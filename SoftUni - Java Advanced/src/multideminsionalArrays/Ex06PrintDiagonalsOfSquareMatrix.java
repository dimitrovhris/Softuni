package multideminsionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int [][] square = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                square[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", square[i][i]);
        }
        System.out.println();
        int j = 0;
        for(int i = n -1; i >= 0; i--){
            System.out.printf("%d ", square[i][j]);
            j++;
        }
    }
}
