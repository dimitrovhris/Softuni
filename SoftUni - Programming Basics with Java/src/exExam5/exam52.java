package exExam5;

import java.util.Scanner;

public class exam52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guests = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double breads = Math.ceil(1.0 * guests / 3);
        int eggs = guests * 2;
        double totalSum = breads * 4 + eggs * 0.45;

        double lessMore = Math.abs(totalSum - budget);

        if(budget >= totalSum){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n", breads, eggs);
            System.out.printf("He has %.2f lv. left.", lessMore);
        }
        else{
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", lessMore);
        }
    }
}
