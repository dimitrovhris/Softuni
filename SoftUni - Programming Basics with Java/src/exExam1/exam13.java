package exExam1;

import java.util.Scanner;

public class exam13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int joineryCount = Integer.parseInt(sc.nextLine());
        String joineryType = sc.nextLine();
        String deliveryType = sc.nextLine();
        int discountPercent = 0;
        double deliveryPrice = 0;
        double price = 0;
        if (joineryCount < 10){
            System.out.println("Invalid order");
        }
        else{
            switch (joineryType){
                case "90X130" -> {price = 110;
                    if (joineryCount > 30 && joineryCount <= 60){
                        discountPercent = 5;
                    }
                    else if (joineryCount > 60){
                        discountPercent = 8;
                    }
                }
                case "100X150" -> {price = 140;
                    if (joineryCount > 40 && joineryCount <= 80){
                        discountPercent = 6;
                    }
                    else if (joineryCount > 80){
                        discountPercent = 10;
                    }
                }
                case "130X180" -> {price = 190;
                    if (joineryCount > 20 && joineryCount <= 50){
                        discountPercent = 7;
                    }
                    else if (joineryCount > 50){
                        discountPercent = 12;
                    }
                }
                case "200X300" -> {price = 250;
                    if (joineryCount > 25 && joineryCount <= 50){
                        discountPercent = 9;
                    }
                    else if (joineryCount > 50){
                        discountPercent = 14;
                    }
                }
            }
            double sumForNow = joineryCount * price - 1.0 * discountPercent / 100 * (joineryCount * price);
            if(joineryCount > 99){
                discountPercent = 4;
            }
            else{
                discountPercent = 0;
            }
            if(deliveryType.equals("With delivery")){
                deliveryPrice = 60;
            }
            else{
                deliveryPrice = 0;
            }
            double totalSum = sumForNow + deliveryPrice - 1.0 * discountPercent / 100 * (sumForNow + deliveryPrice);
            System.out.printf("%.2f BGN", totalSum);
        }
    }
}
