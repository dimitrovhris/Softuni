package nestedConditionalEx;

import java.util.Scanner;

public class NestedEx6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double budget = Double.parseDouble(readData.nextLine());
        String season = readData.nextLine();

        String place = "";
        String holidayType = "";
        double price = 0.00;

        if (budget <= 100) {
            place = "Bulgaria";
            switch (season) {
                case "summer":
                    holidayType = "Camp";
                    price = 0.30 * budget;
                    break;
                case "winter":
                    holidayType = "Hotel";
                    price = 0.70 * budget;
                    break;
            }
        }else if (budget <= 1000){
            place = "Balkans";
            switch (season) {
                case "summer":
                    holidayType = "Camp";
                    price = 0.40 * budget;
                    break;

                case "winter":
                    holidayType = "Hotel";
                    price = 0.80 * budget;
                    break;
            }
        }else{
            place = "Europe";
            holidayType = "Hotel";
            price = 0.90 * budget;
        }
        System.out.printf("Somewhere in %s\n", place);
        System.out.printf("%s - %.2f", holidayType, price);

    }
}
