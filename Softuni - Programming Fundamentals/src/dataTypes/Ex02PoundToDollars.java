package dataTypes;

import java.util.Scanner;

public class Ex02PoundToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = Double.parseDouble(sc.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f", dollars);
    }
}
