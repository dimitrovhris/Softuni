package simpleCalculationsEx;

import java.util.Scanner;

public class MoreSimple4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double kgPriceVegetables = Double.parseDouble(readData.nextLine());
        double kgPriceFruits = Double.parseDouble(readData.nextLine());
        double vegetablesKg = Double.parseDouble(readData.nextLine());
        double fruitsKg = readData.nextDouble();

        double sumBGN = (kgPriceVegetables * vegetablesKg) + (kgPriceFruits * fruitsKg);
        double sumEUR = sumBGN / 1.94;

        System.out.printf("%.2f", sumEUR);

    }
}
