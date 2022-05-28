package whileLoopsEx;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyNeed = Double.parseDouble(sc.nextLine());
        double moneyNow = Double.parseDouble(sc.nextLine());
        int daySpend = 0;
        int allDays = 0;
        while(moneyNow != moneyNeed && daySpend < 5){
            String operation = sc.nextLine();
            double incOut = Double.parseDouble(sc.nextLine());
            if (operation.equals("save")) {
                moneyNow += incOut;
            }
            else{
                daySpend++;
                if(incOut >= moneyNow){
                    moneyNow = 0;
                }
                else{
                    moneyNow -= incOut;
                }
            }
            allDays++;
        }
        if(moneyNow >= moneyNeed){
            System.out.println("You saved the money for " + allDays + " days.");
        }
        else{
            System.out.println("You can't save the money.\n" + allDays);
        }
    }
}
