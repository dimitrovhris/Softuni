package dataTypesEx;

import java.util.Scanner;

public class Ex04SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(int i = 1; i <= n; i++){
            char currentChar = sc.nextLine().charAt(0);
            sum += currentChar;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
