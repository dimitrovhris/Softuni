package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double totalPrice = 0;
        for(int i = 1; i <= n; i++){
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            double currentPrice = days * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            totalPrice += currentPrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
