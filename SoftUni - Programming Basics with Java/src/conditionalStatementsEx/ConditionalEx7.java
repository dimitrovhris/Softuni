package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int videoCards = Integer.parseInt(sc.nextLine());
        int processors = Integer.parseInt(sc.nextLine());
        int ram = Integer.parseInt(sc.nextLine());

        double videoCardPrice = 250;
        double processorPrice = videoCards * 0.35 * 250;
        double ramPrice = videoCards * 0.10 * 250;

        double totalSum = videoCards * videoCardPrice + processors * processorPrice + ram * ramPrice;
        if(videoCards > processors){
            totalSum -= totalSum * 0.15;
        }
        double leftMoreMoney = Math.abs(totalSum - budget);
        if(totalSum <= budget){
            System.out.printf("You have %.2f leva left!", leftMoreMoney);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!", leftMoreMoney);
        }

    }
}
