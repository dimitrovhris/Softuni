package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        String filmType= readData.nextLine();
        int rows = Integer.parseInt(readData.nextLine());
        int columns = Integer.parseInt(readData.nextLine());

        int seats = rows * columns;

        double price = 0.00;
        if (filmType.equals("Premiere")){
            price = seats * 12.00;
        }
        else if (filmType.equals("Normal")){
            price = seats * 7.50;
        }else if (filmType.equals("Discount")){
            price = seats * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}
