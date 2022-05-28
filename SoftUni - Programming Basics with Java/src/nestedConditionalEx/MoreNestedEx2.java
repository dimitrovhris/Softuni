package nestedConditionalEx;
import java.util.Scanner;
public class MoreNestedEx2 {
    public static void main(String[] args) {

        Scanner readData = new Scanner(System.in);
        int juniorPeople = Integer.parseInt(readData.nextLine());
        int seniorPeople = Integer.parseInt(readData.nextLine());
        String trace = readData.nextLine();

        double juniorPrice = 0;
        double seniorPrice = 0;

        switch(trace){
            case "trail" ->{
                juniorPrice = 5.50;
                seniorPrice = 7.00;
            }case "cross-country" ->{
                juniorPrice = 8.00;
                seniorPrice = 9.50;
            }case "downhill" ->{
                juniorPrice = 12.25;
                seniorPrice = 13.75;
            }case "road" ->{
                juniorPrice = 20.00;
                seniorPrice = 21.50;
            }
        }
        double totalSum = juniorPeople * juniorPrice + seniorPeople * seniorPrice;
        if ((juniorPeople + seniorPeople >= 50) && trace.equals("cross-country")){
            totalSum = totalSum - 0.25 * totalSum;
        }
        totalSum = totalSum - 0.05 * totalSum;
        System.out.printf("%.2f", totalSum);
    }
}
