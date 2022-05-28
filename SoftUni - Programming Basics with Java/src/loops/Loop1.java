package loops;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tournaments = Integer.parseInt(sc.nextLine());
        int beginPoints = Integer.parseInt(sc.nextLine());
        int totalPoints = beginPoints;
        int wins = 0;
        for(int i = 1; i <= tournaments; i++){
            String result = sc.nextLine();
            switch(result){
                case "W":
                    totalPoints += 2000;
                    wins++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }
        }
        int averagePoints = (totalPoints - beginPoints) / tournaments;
        double percentWins = 1.0 * wins / tournaments * 100;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentWins);
    }
}
