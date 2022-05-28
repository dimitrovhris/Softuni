package exExam2;

import java.util.Scanner;

public class exam23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String size = sc.nextLine();
        double price = 0;
        int orderedSets = Integer.parseInt(sc.nextLine());
        if(size.equals("big")){
            switch (fruit){
                case "Watermelon" :
                    price = 28.70 * 5;
                    break;
                case "Mango":
                    price = 19.60 * 5;
                    break;
                case "Pineapple":
                    price = 24.80 * 5;
                    break;
                case "Raspberry":
                    price = 15.20 * 5;
                    break;
            }
        }
        else{
            switch (fruit) {
                case "Watermelon":
                    price = 56 * 2;
                    break;
                case "Mango":
                    price = 36.66 * 2;
                    break;
                case "Pineapple":
                    price = 42.10 * 2;
                    break;
                case "Raspberry":
                    price = 20.00 * 2;
                    break;
            }
        }
        double totalSum = orderedSets * price;
        if(totalSum >= 400 && totalSum <= 1000){
            totalSum -= 0.15 * totalSum;
        }
        else if(totalSum > 1000){
            totalSum -= 0.50 * totalSum;
        }
        System.out.printf("%.2f lv.", totalSum);
    }
}
