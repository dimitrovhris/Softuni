package basicSyntaxEx;

import java.util.Scanner;

public class MoreBasicEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double currentBalance = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();
        double totalSpent = 0;
        boolean outOfMoney = false;

        while(!input.equals("Game Time")){
            boolean valid = true;
            double price = 0;
            switch (input){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    valid = false;
                    System.out.println("Not Found");
            }
            totalSpent += price;
            if(totalSpent > currentBalance){
                System.out.println("Too Expensive");
                totalSpent -= price;
                valid = false;
            }
            if (valid){
                System.out.printf("Bought %s%n", input);
            }
            if(totalSpent == currentBalance){
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }

            input = sc.nextLine();
        }
        if(!outOfMoney){
            double moneyLeft = currentBalance - totalSpent;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, moneyLeft);
        }
    }
}
