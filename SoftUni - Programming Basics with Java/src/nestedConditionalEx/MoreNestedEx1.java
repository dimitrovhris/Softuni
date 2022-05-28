package nestedConditionalEx;
import java.util.Scanner;
public class MoreNestedEx1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double budget = Double.parseDouble(readData.nextLine());
        String ticketType = readData.nextLine();
        int people = Integer.parseInt(readData.nextLine());

        double transportPrice = 0;

        if (people <= 4){
            transportPrice = 0.75 * budget;
        }else if(people <= 9){
            transportPrice = 0.60 * budget;
        }else if(people <= 24){
            transportPrice = 0.50 * budget;
        }else if (people <= 49){
            transportPrice = 0.40 * budget;
        }else{
            transportPrice = 0.25 * budget;
        }
        double totalSum = budget - transportPrice;
        double totalTicketPrice = 0;
       if (ticketType.equals("VIP")){
           totalTicketPrice = people * 499.99;
       }else {
           totalTicketPrice = people * 249.99;
       }
        if (totalTicketPrice <= totalSum){
            double moneyLeft = totalSum - totalTicketPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        }else{
            double moneyNeed = totalTicketPrice - totalSum;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeed);
        }
    }
}
