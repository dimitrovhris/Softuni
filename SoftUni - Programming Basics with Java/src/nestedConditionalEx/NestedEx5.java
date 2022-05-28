package nestedConditionalEx;

import java.util.Scanner;

public class NestedEx5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int budget = Integer.parseInt(readData.nextLine());
        String season = readData.nextLine();
        int fishers = Integer.parseInt(readData.nextLine());

        double price = 0.00;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fishers <= 6) {
            price = price - 0.10 * price;
        } else if (fishers <= 11) {
            price = price - 0.15 * price;
        } else{
            price = price - 0.25 * price;
        }
        boolean autumn = (season.equals("Autumn"));
        if ((fishers % 2 == 0) && !autumn) {
            price = price - 0.05 * price;
        }
        if (budget >= price){
            double moneyLeft = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }else{
            double moreMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moreMoney);
        }
    }
}
