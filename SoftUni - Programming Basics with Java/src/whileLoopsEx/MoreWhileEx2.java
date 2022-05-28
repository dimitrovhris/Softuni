package whileLoopsEx;

import java.util.Scanner;

public class MoreWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNeed = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int totalSum = 0;
        String typeOfOperation = "";
        int cardPayments = 0;
        int cashPayments = 0;
        double totalCash = 0;
        double totalCard = 0;
        for(int i = 1; totalSum < sumNeed && !input.equals("End"); i++){
            int income = Integer.parseInt(input);
            //Cash
            if(i % 2 != 0){
                if(income > 100){
                    typeOfOperation = "Error in transaction!";
                }
                else{
                    typeOfOperation = "Product sold!";
                    cashPayments++;
                    totalCash += income;
                }
            }
            //Card
            else{
                if(income < 10){
                    typeOfOperation = "Error in transaction!";
                }
                else{
                    typeOfOperation = "Product sold!";
                    cardPayments++;
                    totalCard += income;
                }
            }
            System.out.println(typeOfOperation);
            if(typeOfOperation.equals("Product sold!")){
                totalSum += income;
            }
            if(totalSum < sumNeed){
                input = sc.nextLine();
            }
        }
        double averageCash = totalCash / cashPayments;
        double averageCard = totalCard / cardPayments;
        if(input.equals("End")){
            System.out.println("Failed to collect required money for charity.");
        }
        else{
            System.out.printf("Average CS: %.2f\nAverage CC: %.2f", averageCash, averageCard);
        }
    }
}
