package dataTypes;

import java.util.Scanner;

public class Ex01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meters = Integer.parseInt(sc.nextLine());
        double kilometers = 1.0 * meters / 1000;
        System.out.printf("%.2f", kilometers);
    }
}