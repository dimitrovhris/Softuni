package exExam7;

import java.util.Scanner;

public class exam76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int wins = 0;
        int loses = 0;
        int matches = 0;
        while(!input.equals("End of tournaments")){
            int games = Integer.parseInt(sc.nextLine());
            for(int i = 1; i <= games; i++){
                matches++;
                int desiPoints = Integer.parseInt(sc.nextLine());
                int otherPoints = Integer.parseInt(sc.nextLine());
                int lessMore = Math.abs(desiPoints - otherPoints);
                if(desiPoints > otherPoints){
                    wins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, input, lessMore);
                }
                else{
                    loses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, input, lessMore);
                }
            }
            input = sc.nextLine();
        }
        double percentWins = 1.0 * wins / matches * 100;
        double percentLoses = 1.0 * loses / matches * 100;
        System.out.printf("%.2f%% matches win%n", percentWins);
        System.out.printf("%.2f%% matches lost", percentLoses);
    }
}
