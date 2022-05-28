package nestedConditional;

import java.util.Scanner;

public class Nested8 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String fruit = readData.nextLine();
        String day = readData.nextLine();
        double amount = Double.parseDouble(readData.nextLine());
        double price = 0.00;
        boolean mF = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday");
        boolean sS = day.equals("Saturday") || day.equals("Sunday");
        boolean fruitIsTrue = fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grapefruit")
                || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes");

        if (mF) {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }

        } else if (sS) {
            switch (fruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
            }

        }
        if (!fruitIsTrue || (!mF && !sS)){
            System.out.println("error");
        }
        else{
            double newPrice = amount * price;
            System.out.printf("%.2f", newPrice);
        }
    }
}
