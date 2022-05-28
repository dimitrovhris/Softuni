package simpleCalculationsEx;

import java.util.Scanner;

public class MoreSimple3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double celsius = readData.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fahrenheit);

    }
}
