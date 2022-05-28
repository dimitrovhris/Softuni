package exExam5;

import java.util.Scanner;

public class exam54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggsInStore = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int eggsFillBuy = Integer.parseInt(sc.nextLine());
        int eggsBuying = 0;
        int eggsSold = 0;
        if(input.equals("Buy")){
            eggsBuying = eggsFillBuy;
        }
        while(!input.equals("Close") && eggsBuying <= eggsInStore){
            if(input.equals("Buy")){
                eggsInStore -= eggsFillBuy;
                eggsSold += eggsBuying;
            }
            else{
                eggsInStore += eggsFillBuy;
            }
            input = sc.nextLine();
            if(!input.equals("Close")){
            eggsFillBuy = Integer.parseInt(sc.nextLine());
                if(input.equals("Buy")){
                    eggsBuying = eggsFillBuy;
                }
                else{
                    eggsBuying = 0;
                }
            }
        }
        if(input.equals("Close")){
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", eggsSold);
        }
        else{
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", eggsInStore);
        }
    }
}
