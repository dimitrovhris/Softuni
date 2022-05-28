package exExam3;

import java.util.Scanner;

public class exam33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ourSum = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String sport = sc.nextLine();

        double price = 0;

        if(gender.equals("m")){
            switch(sport){
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;
            }
        }
        else{
            switch(sport){
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                case "Pilates":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;
            }
        }
        if(age <= 19){
            price -= 0.20 * price;
        }
        if(ourSum >= price){
            System.out.printf("You purchased a 1 month pass for %s", sport);
        }
        else{
            double moreMoney = price - ourSum;
            System.out.printf("You don't have enough money! You need $%.2f more.", moreMoney);
        }
    }
}
