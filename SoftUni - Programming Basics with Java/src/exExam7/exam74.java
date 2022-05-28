package exExam7;

import java.util.Scanner;

public class exam74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player = sc.nextLine();
        String input = sc.nextLine();
        int winShots = 0;
        int lostShots = 0;
        int totalPoints = 301;
        while(!input.equals("Retire") && totalPoints > 0){
            int pointsNow = Integer.parseInt(sc.nextLine());
            switch(input){
                case "Double":
                    pointsNow = pointsNow * 2;
                    break;
                case "Triple":
                    pointsNow = pointsNow * 3;
                    break;
            }
            if(pointsNow <= totalPoints){
                winShots++;
                totalPoints -= pointsNow;
            }
            else{
                lostShots++;
            }
            if(totalPoints > 0)
            input = sc.nextLine();
        }
        if(input.equals("Retire")){
            System.out.printf("%s retired after %d unsuccessful shots.", player, lostShots);
        }
        else{
            System.out.printf("%s won the leg with %d shots.", player, winShots);
        }
    }
}
