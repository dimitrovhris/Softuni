package conditionalStatements;
import java.util.Scanner;
public class Conditional7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String figure = readData.nextLine();
        double area = 0.000;

        if (figure.equals("square")){
            double a = readData.nextDouble();
            area = a * a;
        }
        else if(figure.equals("rectangle")){
            double a = readData.nextDouble();
            double b = readData.nextDouble();
            area = a * b;

        }
        else if(figure.equals("circle")){
            double r = readData.nextDouble();
            area = Math.PI * Math.pow(r, 2);
        }
        else if(figure.equals("triangle")){
            double a = readData.nextDouble();
            double h = readData.nextDouble();
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
