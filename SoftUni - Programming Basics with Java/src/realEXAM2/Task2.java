package realEXAM2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String footballFan = sc.nextLine();
        double budget = Double.parseDouble(sc.nextLine());
        int beerBottles = Integer.parseInt(sc.nextLine());
        int packetsChips = Integer.parseInt(sc.nextLine());

        double beerSum = beerBottles * 1.20;
        double chipsSum = Math.ceil(packetsChips * (0.45 * beerSum));
        double totalSum = beerSum + chipsSum;

        double moneyMoreLeft = Math.abs(budget - totalSum);
        if (budget >= totalSum){
            System.out.printf("%s bought a snack and has %.2f leva left.", footballFan, moneyMoreLeft);
        }
        else{
            System.out.printf("%s needs %.2f more leva!", footballFan, moneyMoreLeft);
        }
    }
}
