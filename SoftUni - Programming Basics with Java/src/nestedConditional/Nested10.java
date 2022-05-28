package nestedConditional;
import java.util.Scanner;
public class Nested10 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int days = Integer.parseInt(readData.nextLine());
        String room = readData.nextLine();
        String mark = readData.nextLine();

        int nights = days - 1;

        double price = 0.00;
        if (room.equals("room for one person")){
            price = nights * 18.00;
        }
        else if (room.equals("apartment")){
            price = nights * 25.00;
            if (days < 10){
                price = price - 0.30 * price;
            }
            else if (days >= 10 && days <= 15){
                price = price - 0.35 * price;
            }
            else if (days > 15){
                price = price - 0.50 * price;
            }
        }
        else if(room.equals("president apartment")){
            price = nights * 35.00;
            if (days < 10){
                price = price - 0.10 * price;
            }
            else if (days >= 10 && days <= 15){
                price = price - 0.15 * price;
            }
            else if (days > 15){
                price = price - 0.20 * price;
            }
        }if (mark.equals("positive")){
            price = price + 0.25 * price;
        }
        else if(mark.equals("negative")){
            price = price - 0.10 * price;
        }
        System.out.printf("%.2f", price);

    }
}
