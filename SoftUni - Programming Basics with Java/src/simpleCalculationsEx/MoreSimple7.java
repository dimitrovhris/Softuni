package simpleCalculationsEx;
import java.util.Scanner;
public class MoreSimple7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double x = readData.nextDouble();
        double y = readData.nextDouble();
        double h = readData.nextDouble();

        double frontSidesArea = 2 * x * x - 1.2 * 2;
        double lateralSidesArea = 2 * x * y - 2 * 1.5 * 1.5;
        double roofArea = 2 * x * y + 2 * (x * h / 2);
        double greenArea = frontSidesArea + lateralSidesArea;
        double redArea = roofArea;
        double greenLiters = greenArea / 3.4;
        double redLiters = redArea / 4.3;

        System.out.printf("%.2f\n", greenLiters);
        System.out.printf("%.2f", redLiters);



    }
}
