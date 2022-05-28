package nestedConditionalEx;

import java.util.Scanner;

public class MoreNestedEx5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double budget = Double.parseDouble(readData.nextLine());
        String season = readData.nextLine();

        double price = 0;
        String location = "";
        String place = "";

        if (budget <= 1000) {
            place = "Camp";
            switch (season) {
                case "Summer" -> {
                    location = "Alaska";
                    price = 0.65 * budget;
                }
                case "Winter" -> {
                    location = "Morocco";
                    price = 0.45 * budget;
                }
            }
        } else if (budget > 1000 && budget <= 3000) {
            place = "Hut";
            switch (season) {
                case "Summer" -> {
                    location = "Alaska";
                    price = 0.80 * budget;
                }
                case "Winter" -> {
                    location = "Morocco";
                    price = 0.60 * budget;
                }
            }
        }else {
            place = "Hotel";
            price = 0.90 * budget;
            switch (season){
                case "Summer" -> location = "Alaska";
                case "Winter" -> location = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
