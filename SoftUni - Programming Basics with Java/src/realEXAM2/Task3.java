package realEXAM2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String baking = sc.nextLine();
        int purchasedProducts = Integer.parseInt(sc.nextLine());
        int decemberDay = Integer.parseInt(sc.nextLine());
        double price = 0;
        if(decemberDay <= 15){
            switch (baking){
                case "Cake":
                    price = 24;
                    break;
                case "Souffle":
                    price = 6.66;
                    break;
                case "Baklava":
                    price = 12.60;
                    break;
            }
        }
        else{
            switch (baking){
                case "Cake":
                    price = 28.70;
                    break;
                case "Souffle":
                    price = 9.80;
                    break;
                case "Baklava":
                    price = 16.98;
                    break;
            }
        }
        double totalPrice = price * purchasedProducts;
        if(decemberDay <= 22){
            if(totalPrice >= 100 && totalPrice <= 200){
                totalPrice -= 0.15 * totalPrice;
            }
            else{
                totalPrice -= 0.25 * totalPrice;
            }
            if(decemberDay <= 15){
                totalPrice -= 0.10 * totalPrice;
            }
        }
        System.out.printf("%.2f", totalPrice);
    }
}
