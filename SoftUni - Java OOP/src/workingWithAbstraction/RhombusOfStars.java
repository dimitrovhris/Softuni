package workingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printTopPart(n);
        printRow(n);
        printBottomPart(n);
    }
    private static void printRow(int numOfStars){
        StringBuilder stringbuilder = new StringBuilder();

        for(int i = 1; i <= numOfStars; i++){
            stringbuilder.append("* ");
        }
        System.out.println(stringbuilder.toString().trim());
    }
    private static void printTopPart(int n){

        for(int i = 1; i <= n -1; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            printRow(i);
        }
    }
    private static void printBottomPart(int n){
        for(int i = n - 1; i >= 1; i--){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            printRow(i);
        }
    }
}
