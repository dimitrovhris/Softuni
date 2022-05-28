package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double budget = Double.parseDouble(readData.nextLine());
        double statists = Double.parseDouble(readData.nextLine());
        double wearPrice = Double.parseDouble(readData.nextLine());

        double decorsPrice = 0.10 * budget;
        double clothesPrice = statists * wearPrice;

        if (statists > 150){
            clothesPrice = statists * wearPrice - 0.10 * (statists * wearPrice);
        }
        double totalMoney = decorsPrice + clothesPrice;

        if (budget >= totalMoney){
            double moneyLeft = budget - totalMoney;
            System.out.print("Action!\n");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
        else {
            double moneyNeed = totalMoney - budget;
            System.out.print("Not enough money!\n");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeed);
        }
    }
}
