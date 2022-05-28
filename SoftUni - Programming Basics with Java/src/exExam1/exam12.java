package exExam1;

import java.util.Scanner;

public class exam12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceOver20 = Double.parseDouble(sc.nextLine());
        double luggageKg = Double.parseDouble(sc.nextLine());
        double daysLeft = Integer.parseInt(sc.nextLine());
        int luggageCount = Integer.parseInt(sc.nextLine());

        double luggagePrice = 0;
        if (luggageKg < 10){
            luggagePrice = 0.20 * priceOver20;
        }
        else if(luggageKg <= 20){
            luggagePrice = 0.50 * priceOver20;
        }
        else{
            luggagePrice = priceOver20;
        }
        if (daysLeft > 30){
            luggagePrice += luggagePrice * 0.10;
        }
        else if (daysLeft >= 7){
            luggagePrice += luggagePrice * 0.15;
        }
        else{
            luggagePrice += luggagePrice * 0.40;
        }
        double totalSum = luggageCount * luggagePrice;
        System.out.printf("The total price of bags is: %.2f lv.", totalSum);
    }
}
