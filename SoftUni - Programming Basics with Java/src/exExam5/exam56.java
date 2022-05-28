package exExam5;

import java.util.Scanner;

public class exam56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clients = Integer.parseInt(sc.nextLine());
        double totalSum = 0;
        for(int i = 1; i <= clients; i++){
            int basketsBought = 0;
            int wreathsBought = 0;
            int bunniesBought = 0;
            int totalItems = 0;
            String input = sc.nextLine();
            while(!input.equals("Finish")){
                    switch(input){
                        case "basket":
                            basketsBought++;
                            break;
                        case "wreath":
                            wreathsBought++;
                            break;
                        case "chocolate bunny":
                            bunniesBought++;
                    }
                input = sc.nextLine();
            }
            totalItems = basketsBought + wreathsBought + bunniesBought;
            double sum = basketsBought * 1.50 + wreathsBought * 3.80 + bunniesBought * 7.00;
            if(totalItems % 2 == 0){
                sum -= 0.20 * sum;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", totalItems, sum);
            totalSum += sum;
        }
        double averageSum = totalSum / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averageSum);
    }
}
