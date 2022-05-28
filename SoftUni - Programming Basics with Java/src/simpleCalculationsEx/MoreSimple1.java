package simpleCalculationsEx;

import java.util.Scanner;

public class MoreSimple1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double b1 = Double.parseDouble(readData.nextLine());
        double b2 = Double.parseDouble(readData.nextLine());
        double h = readData.nextDouble();

        double area = (b1+b2) /2 * h;
        System.out.printf("%.2f",area);

    }

}
