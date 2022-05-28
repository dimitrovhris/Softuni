package nestedConditionalEx;

import java.util.Scanner;

public class MoreNestedEx3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(readData.nextLine());
        int roses = Integer.parseInt(readData.nextLine());
        int laleta = Integer.parseInt(readData.nextLine());
        String season = readData.nextLine();
        String holiday = readData.nextLine();

        double hrizantemiPrice = 0;
        double rosesPrice = 0;
        double laletaPrice = 0;

        switch (season) {
            case "Spring", "Summer" -> {
                hrizantemiPrice = 2.00;
                rosesPrice = 4.10;
                laletaPrice = 2.50;
            }
            case "Autumn", "Winter" -> {
                hrizantemiPrice = 3.75;
                rosesPrice = 4.50;
                laletaPrice = 4.15;
            }
        }
        if (holiday.equals("Y")){
            hrizantemiPrice = hrizantemiPrice + 0.15 * hrizantemiPrice;
            rosesPrice = rosesPrice + 0.15 * rosesPrice;
            laletaPrice = laletaPrice + 0.15 * laletaPrice;
        }
        double totalSum = hrizantemi * hrizantemiPrice + roses * rosesPrice + laleta * laletaPrice;
        if (laleta > 7 && season.equals("Spring")){
            totalSum = totalSum - 0.05 * totalSum;
        }
        if (roses >= 10 && season.equals("Winter")){
            totalSum = totalSum - 0.10 * totalSum;
        }
        if ((laleta + roses + hrizantemi) > 20){
            totalSum = totalSum - 0.20 * totalSum;
        }
        totalSum = totalSum + 2;
        System.out.printf("%.2f", totalSum);
    }
}
