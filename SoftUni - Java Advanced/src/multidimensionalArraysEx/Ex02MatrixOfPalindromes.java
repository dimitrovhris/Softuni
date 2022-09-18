package multidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = data[0];
        int cols = data[1];
        char currentChar = 97;
        for(int i = 0; i < rows; i++){
            char secondChar = currentChar;
            for(int j = 0; j < cols; j++){
                System.out.printf("%c%c%c ", currentChar, secondChar, currentChar);
                secondChar++;
            }
            currentChar++;
            System.out.println();
        }
    }
}
