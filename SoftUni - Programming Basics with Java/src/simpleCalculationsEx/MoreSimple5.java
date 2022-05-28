package simpleCalculationsEx;
import java.util.Scanner;
public class MoreSimple5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double length = readData.nextDouble();
        double width = readData.nextDouble();

        double lengthCM = length * 100;
        double widthCM = width * 100;

        double deskOnLine = Math.floor ((widthCM-100)/ 70);
        double lines = Math.floor(lengthCM / 120);

        int workPlaces = (int) (deskOnLine * lines - 3);
        int a = 6;

        System.out.println(workPlaces);




    }
}
