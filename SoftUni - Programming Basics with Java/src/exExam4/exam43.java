package exExam4;

import java.util.Scanner;

public class exam43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String destination = sc.nextLine();
        String dates = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        double price = 0;
        if(dates.equals("21-23")){
            switch(destination){
                case "France":
                    price = 30;
                    break;
                case "Italy":
                    price = 28;
                    break;
                case "Germany":
                    price = 32;
                    break;
            }
        }
        else if(dates.equals("24-27")){
            switch(destination){
                case "France":
                    price = 35;
                    break;
                case "Italy":
                    price = 32;
                    break;
                case "Germany":
                    price = 37;
                    break;
            }
        }
        else{
            switch(destination){
                case "France":
                    price = 40;
                    break;
                case "Italy":
                    price = 39;
                    break;
                case "Germany":
                    price = 43;
                    break;
            }
        }
        double totalPrice = nights * price;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
