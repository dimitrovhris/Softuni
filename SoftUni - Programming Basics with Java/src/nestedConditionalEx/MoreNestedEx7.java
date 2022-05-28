package nestedConditionalEx;

import java.util.Scanner;

public class MoreNestedEx7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        String season = readData.nextLine();
        String group = readData.nextLine();
        int students = Integer.parseInt(readData.nextLine());
        int nights = Integer.parseInt(readData.nextLine());
        double price = 0;

        if (season.equals("Winter")) {
            switch (group) {
                case "boys", "girls" -> price = 9.60 * nights * students;
                case "mixed" -> price = 10 * nights * students;
            }
        } else if (season.equals("Spring")) {
            switch (group) {
                case "boys", "girls" -> price = 7.20 * nights * students;
                case "mixed" -> price = 9.50 * nights * students;
            }
        } else {
            switch (group) {
                case "boys", "girls" -> price = 15 * nights * students;
                case "mixed" -> price = 20 * nights * students;
            }
        }
        if (students >= 50) {
            price = price - 0.5 * price;
        } else if (students >= 20) {
            price = price - 0.15 * price;
        } else if (students >= 10) {
            price = price - 0.05 * price;
        }
        String sport = "";
        if (season.equals("Winter")) {
            switch (group) {
                case "girls" -> sport = "Gymnastics";
                case "boys" -> sport = "Judo";
                case "mixed" -> sport = "Ski";
            }
        } else if (season.equals("Spring")) {
            switch (group) {
                case "girls" -> sport = "Athletics";
                case "boys" -> sport = "Tennis";
                case "mixed" -> sport = "Cycling";
            }
        } else {
            switch (group) {
                case "girls" -> sport = "Volleyball";
                case "boys" -> sport = "Football";
                case "mixed" -> sport = "Swimming";
            }

        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
