package exExam5;

import java.util.Scanner;

public class exam53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eggsSize = sc.nextLine();
        String eggsColor = sc.nextLine();
        int batches = Integer.parseInt(sc.nextLine());
        double price = 0;
        if(eggsColor.equals("Red")){
            switch(eggsSize){
                case "Large":
                    price = 16;
                    break;
                case "Medium":
                    price = 13;
                    break;
                case "Small":
                    price = 9;
                    break;
            }
        }
        else if (eggsColor.equals("Green")){
            switch(eggsSize){
                case "Large":
                    price = 12;
                    break;
                case "Medium":
                    price = 9;
                    break;
                case "Small":
                    price = 8;
                    break;
            }
        }
        else{
            switch(eggsSize){
                case "Large":
                    price = 9;
                    break;
                case "Medium":
                    price = 7;
                    break;
                case "Small":
                    price = 5;
                    break;
            }
        }
        double totalSum = 0.65 * price * batches;
        System.out.printf("%.2f leva.", totalSum);
    }
}
