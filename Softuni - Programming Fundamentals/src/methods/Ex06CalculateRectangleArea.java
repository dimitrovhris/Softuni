package methods;

import java.util.Scanner;

public class Ex06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double area = rectangleArea(a, b);
        System.out.printf("%.0f", area);
    }
    public static double rectangleArea (double firstSide, double secondSide){
        return firstSide * secondSide;
    }
}
