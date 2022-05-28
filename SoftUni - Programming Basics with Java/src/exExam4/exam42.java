package exExam4;

import java.util.Scanner;

public class exam42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guests = Integer.parseInt(sc.nextLine());
        double priceForPerson = Double.parseDouble(sc.nextLine());
        double budget = Double.parseDouble(sc.nextLine());


        if(guests >= 10 && guests <= 15){
            priceForPerson -= 0.15 * priceForPerson;
        }
        else if(guests <= 20 && guests > 15){
            priceForPerson -= 0.20 * priceForPerson;
        }
        else if (guests > 20){
            priceForPerson -= 0.25 * priceForPerson;
        }
        double cakePrice = 0.10 * budget;
        double totalSum = guests * priceForPerson + cakePrice;
        double moreLess = Math.abs(budget - totalSum);
        if(budget >= totalSum){
            System.out.printf("It is party time! %.2f leva left.", moreLess);
        }
        else{
            System.out.printf("No party! %.2f leva needed.", moreLess);
        }
    }
}