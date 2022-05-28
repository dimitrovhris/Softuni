package exExam2;

import java.util.Scanner;

public class exam24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        double totalFood = Double.parseDouble(sc.nextLine());
        int dogEaten = 0;
        int catEaten = 0;
        int totalDog = 0;
        int totalCat = 0;
        double biscuits = 0;
        for(int i = 1; i<= days; i++){
            dogEaten = Integer.parseInt(sc.nextLine());
            catEaten = Integer.parseInt(sc.nextLine());
            totalDog += dogEaten;
            totalCat += catEaten;
            if(i % 3 == 0){
                biscuits += 0.10 * (dogEaten + catEaten);
            }
        }
        double totalFoodEaten = totalDog + totalCat;
        double percentEatenFood = totalFoodEaten / totalFood * 100;
        double percentDog = totalDog / totalFoodEaten * 100;
        double percentCat = totalCat / totalFoodEaten * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        System.out.printf("%.2f%% eaten from the cat.", percentCat);
    }
}
