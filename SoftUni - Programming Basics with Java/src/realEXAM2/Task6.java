package realEXAM2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int locations = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= locations; i++){
            double goldForLocation = 0;
            double averageExcepted = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            for(int j = 1; j <= days; j++){
                double goldToday = Double.parseDouble(sc.nextLine());
                goldForLocation += goldToday;
            }
            double realAverage = goldForLocation / days;
            if(realAverage >= averageExcepted){
                System.out.printf("Good job! Average gold per day: %.2f.%n", realAverage);
            }
            else{
                double goldNeed = averageExcepted - realAverage;
                System.out.printf("You need %.2f gold.%n", goldNeed);
            }
        }
    }
}