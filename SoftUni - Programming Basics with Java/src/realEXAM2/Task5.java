package realEXAM2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foodBought = Double.parseDouble(sc.nextLine()) * 1000;
        String input = sc.nextLine();
        int totalGrams = 0;
        while(!input.equals("Adopted")){
            int gramsNow = Integer.parseInt(input);
            totalGrams += gramsNow;
            input = sc.nextLine();
        }
        double moreLeftFood = Math.abs(foodBought - totalGrams);

        if (totalGrams <= foodBought){
            System.out.printf("Food is enough! Leftovers: %.0f grams.", moreLeftFood);
        }
        else{
            System.out.printf("Food is not enough. You need %.0f grams more.", moreLeftFood);
        }
    }
}
