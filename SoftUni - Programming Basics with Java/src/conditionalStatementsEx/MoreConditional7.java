package conditionalStatementsEx;

import java.util.Scanner;

public class MoreConditional7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int mangolii = Integer.parseInt(readData.nextLine());
        int zumbuli = Integer.parseInt(readData.nextLine());
        int roses = Integer.parseInt(readData.nextLine());
        int kaktusi = Integer.parseInt(readData.nextLine());
        double presentPrice = Double.parseDouble(readData.nextLine());

        double totalPrice = mangolii * 3.25 + zumbuli * 4.00 + roses * 3.50 + kaktusi * 8.00;
        double realTotalPrice = totalPrice - 0.05 * totalPrice;

        if (realTotalPrice < presentPrice) {
            double moneyNeed = Math.ceil(presentPrice - realTotalPrice);
            System.out.printf("She will have to borrow %.0f leva.", moneyNeed);
        } else {
            double moreMoney = Math.floor(realTotalPrice - presentPrice);
            System.out.printf("She is left with %.0f leva.", moreMoney);
        }
    }
}
