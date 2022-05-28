package exExam8and9;

import java.util.Scanner;

public class exam97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int maxNow = Integer.MIN_VALUE;
        String winnerName = "";
        while(!input.equals("Stop")){
            int points = 0;
            int inputLength = input.length();
            for(int i = 0; i < inputLength; i++){
                int letterNum = Integer.parseInt(sc.nextLine());
                char currentLetter = input.charAt(i);
                if (letterNum == currentLetter){
                    points += 10;
                }
                else{
                    points += 2;
                }
            }
            if (points >= maxNow){
                maxNow = points;
                winnerName = input;
            }
            input = sc.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winnerName, maxNow);
    }
}
