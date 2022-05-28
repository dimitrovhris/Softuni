package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputCoin = sc.nextLine();
        double totalPushedSum = 0;

        while(!inputCoin.equals("Start")){
            double currentCoin = Double.parseDouble(inputCoin);
            if(currentCoin == 0.1 || currentCoin == 0.2 || currentCoin == 0.5 || currentCoin == 1 || currentCoin == 2) {
                totalPushedSum+= currentCoin;
            }
            else{
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            }
            inputCoin = sc.nextLine();
        }
        String product = sc.nextLine();
        double sumWant = 0;
        boolean invalid = false;
        while(!product.equals("End")){
            double priceNow = 0;
            switch(product){
                case "Nuts":
                    priceNow = 2;
                    break;
                case "Water":
                    priceNow = 0.7;
                    break;
                case "Crisps":
                    priceNow = 1.5;
                    break;
                case "Soda":
                    priceNow = 0.8;
                    break;
                case "Coke":
                    priceNow = 1;
                    break;
                default:
                    invalid = true;
                    System.out.println("Invalid product");
            }
            sumWant+=priceNow;
            if(totalPushedSum < sumWant){
                System.out.println("Sorry, not enough money");
                sumWant -= priceNow;
            }
            else if(!invalid){
                System.out.printf("Purchased %s%n", product);
            }
            product = sc.nextLine();
        }
        double change = totalPushedSum - sumWant;
        System.out.printf("Change: %.2f", change);
    }
}
