package methods;

import java.util.Scanner;

public class Ex03PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        printTriangle(num);
    }
    public static void printTriangle(int n){
        for(int i = 1; i <= n; i++){
            printLine(1, i);
        }
        for(int i = n - 1; i >= 1; i--){
            printLine(1, i);
        }
    }
    public static void printLine(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
