package revision;

import java.util.Scanner;

public class Ex01ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double totalPrice = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price <= 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += price;
            }
            input = sc.nextLine();
        }
        double taxes = 0.2 * totalPrice;
        double priceWithTaxes = totalPrice + taxes;
        if (input.equals("special")) {
            priceWithTaxes -= priceWithTaxes * 0.10;
        }
        if (priceWithTaxes <= 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", priceWithTaxes);
        }
    }
}
