package conditionalStatements;
import java.util.Scanner;
public class Conditional8 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double tripPrice = readData.nextDouble();
        int puzzles = readData.nextInt();
        int dolls = readData.nextInt();
        int bears = readData.nextInt();
        int minions = readData.nextInt();
        int trucks = readData.nextInt();

        int toysCount = puzzles + dolls + bears + minions + trucks;

        double sum = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;

        double totalSum = 0.00;
        if (toysCount >= 50){
            totalSum = sum - 0.25 * sum;
        }
        else {
            totalSum = sum;
        }
        double realTotalSum = totalSum - 0.10 * totalSum;

        if (realTotalSum >= tripPrice){
            double moneyLeft = realTotalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }
        else{
            double moneyNeeded = tripPrice - realTotalSum;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }

    }
}
