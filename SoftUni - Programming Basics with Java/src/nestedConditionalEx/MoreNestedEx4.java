package nestedConditionalEx;

import java.util.Scanner;

public class MoreNestedEx4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double budget = Double.parseDouble(readData.nextLine());
        String season = readData.nextLine();


        String carClass = "";
        String type = "";
        double price = 0;
        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer" -> {
                    type = "Cabrio";
                    price = 0.35 * budget;
                }
                case "Winter" -> {
                    type = "Jeep";
                    price = 0.65 * budget;
                }
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer" -> {
                    type = "Cabrio";
                    price = 0.45 * budget;
                }
                case "Winter" -> {
                    type = "Jeep";
                    price = 0.80 * budget;
                }
            }
        }else{
            carClass = "Luxury class";
            type = "Jeep";
            price = 0.90 * budget;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", type, price);
    }
}
