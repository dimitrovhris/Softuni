package loopsEx;
import java.util.Scanner;
public class MoreLoops1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(readData.nextLine());
        int yearToLive = Integer.parseInt(readData.nextLine());
        double spentMoney = 0;
        int ivanAge = 18;
        double moneyLeft = 0;
        double totalSpentMoney = 0;

        for (int i = 1800; i<= yearToLive; i++){
            if (i % 2 == 0){
                spentMoney = 12000;
            }else{
                spentMoney = 12000 + 50 * ivanAge;
            }
            ivanAge ++;
            totalSpentMoney = totalSpentMoney + spentMoney;
        }
        moneyLeft = inheritedMoney - totalSpentMoney;
        if (moneyLeft >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        }else{
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
        }
    }
}
