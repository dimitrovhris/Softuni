package simpleCalculationsEx;
import java.util.Scanner;
public class MoreSimple8 {
    public static void main(String[] args) {
        Scanner readRadius = new Scanner (System.in);

        double radius = readRadius.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("%.2f\n", area);
        System.out.printf("%.2f", perimeter);
    }
}
