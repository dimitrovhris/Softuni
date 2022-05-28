package nestedConditionalEx;

import java.util.Scanner;

public class MoreNestedEx6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        String season = readData.nextLine();
        double kilometers = Double.parseDouble(readData.nextLine());
        double salary = 0;

        if (kilometers <= 5000) {
            switch (season) {
                case "Spring", "Autumn" -> salary = 4 * 0.75 * kilometers;
                case "Summer" -> salary = 4 * 0.90 * kilometers;
                case "Winter" -> salary = 4 * 1.05 * kilometers;
            }
        }else if (kilometers <= 10000){
            switch (season){
                case "Spring", "Autumn" -> salary = 4 * 0.95 * kilometers;
                case "Summer" -> salary = 4 * 1.10 * kilometers;
                case "Winter" -> salary = 4 * 1.25 * kilometers;
            }
        }else{
            salary = 4 * kilometers * 1.45;
        }
        double realSalary = salary - 0.10 * salary;
        System.out.printf("%.2f", realSalary);

    }
}
