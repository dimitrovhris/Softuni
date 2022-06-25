package examPreparation;

import java.util.Scanner;

public class Ex01ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double totalPrice = 0;
        double totalTax = 0;
        while (!input.equals("special")) {
            if (input.equals("regular")) {
                break;
            }
            double currentPrice = Double.parseDouble(input);
            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else if (currentPrice == 0) {
                System.out.println("Invalid order!");
            } else {
                totalPrice += currentPrice;
                double currentTax = 0.2 * currentPrice;
                totalTax += currentTax;
            }
            input = sc.nextLine();
        }
        double total = totalPrice + totalTax;
        if(input.equals("special")){
            total -= total * 0.1;
        }
        if(total > 0){
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalPrice);
        System.out.printf("Taxes: %.2f$%n", totalTax);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", total);
        }
        else{
            System.out.println("Invalid order!");
        }
    }
}
