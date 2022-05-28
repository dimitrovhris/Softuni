package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);

        double x1 = Double.parseDouble(readData.nextLine());
        double y1 = Double.parseDouble(readData.nextLine());
        double x2 = Double.parseDouble(readData.nextLine());
        double y2 = Double.parseDouble(readData.nextLine());
        double x = Double.parseDouble(readData.nextLine());
        double y = Double.parseDouble(readData.nextLine());

        boolean firstCondition = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean secondCondition = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if (firstCondition || secondCondition){
            System.out.println("Border");
        }
        else{
            System.out.println("Inside / Outside");
        }

    }
}