package exExam2;

import java.util.Scanner;

public class exam26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays = Integer.parseInt(sc.nextLine());
        double totalMoney = 0;
        int winDays = 0;
        int loseDays = 0;
        for(int i = 1; i<= totalDays; i++){
            double totalMoneyForDay = 0;
            int wins = 0;
            int loses = 0;
            String input = sc.nextLine();
            while(!input.equals("Finish")){
                String result = sc.nextLine();
                if(result.equals("win")){
                    totalMoneyForDay += 20;
                    wins++;
                }
                else{
                    loses++;
                }
                input = sc.nextLine();
            }
            if(wins > loses){
                    totalMoneyForDay += 0.10 * totalMoneyForDay;
                    winDays++;
            }
            else{
                loseDays++;
            }
            totalMoney += totalMoneyForDay;
        }
        if(winDays > loseDays){
            totalMoney += 0.20 * totalMoney;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }
        else{
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}