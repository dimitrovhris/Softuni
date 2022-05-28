package exExam2;

import java.util.Scanner;

public class exam22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutesPerWalk = Integer.parseInt(sc.nextLine());
        int walksPerDay = Integer.parseInt(sc.nextLine());
        int caloriesPerDay = Integer.parseInt(sc.nextLine());
        int burnedCalories = minutesPerWalk * walksPerDay * 5;
        if(burnedCalories >= 0.50 * caloriesPerDay){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        }
        else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
