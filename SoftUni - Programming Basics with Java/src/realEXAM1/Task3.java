package realEXAM1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dancers = Integer.parseInt(sc.nextLine());
        double points = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String country = sc.nextLine();
        double totalSum = 0;
        if(country.equals("Bulgaria"))
            totalSum = dancers * points;
        else{
            totalSum = dancers * points;
            totalSum += 0.5 * totalSum;
        }
        if(season.equals("summer")){
            switch(country){
                case "Bulgaria":
                    totalSum -= totalSum * 0.05;
                    break;
                default:
                    totalSum -= totalSum * 0.10;
            }
        }
        else{
            switch(country){
                case "Bulgaria":
                    totalSum -= totalSum * 0.08;
                    break;
                default:
                    totalSum -= totalSum * 0.15;
            }
        }
        double charitySum = 0.75 * totalSum;
        double sumLeft = totalSum - charitySum;
        double moneyPerDancer = sumLeft / dancers;
        System.out.printf("Charity - %.2f%n", charitySum);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);
    }
}
