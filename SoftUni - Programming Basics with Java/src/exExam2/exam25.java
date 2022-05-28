package exExam2;

import java.util.Scanner;

public class exam25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int foodBought = Integer.parseInt(sc.nextLine()) * 1000;
        String input = sc.nextLine();
        int totalFood = 0;
        while(!input.equals("Adopted")){
            int foodPlus = Integer.parseInt(input);
            totalFood += foodPlus;
            input = sc.nextLine();
        }
        int plusMore = Math.abs(foodBought - totalFood);
        if(totalFood <= foodBought){
            System.out.printf("Food is enough! Leftovers: %d grams.", plusMore);
        }
        else{
            System.out.printf("Food is not enough. You need %d grams more.", plusMore);
        }
    }
}
