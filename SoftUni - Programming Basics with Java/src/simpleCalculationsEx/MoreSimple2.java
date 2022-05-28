package simpleCalculationsEx;

import java.util.Scanner;

public class MoreSimple2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double a = Double.parseDouble(readData.nextLine());
        double h = Double.parseDouble(readData.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
