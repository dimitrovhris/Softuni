package exExam5;

import java.util.Scanner;

public class exam55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breads = Integer.parseInt(sc.nextLine());
        int totalSugarSpent = 0;
        int totalFlourSpent = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;
        for(int i = 1; i <= breads; i++){
            int sugarSpentNow = Integer.parseInt(sc.nextLine());
            int flourSpentNow = Integer.parseInt(sc.nextLine());
            totalSugarSpent += sugarSpentNow;
            totalFlourSpent += flourSpentNow;
            if(sugarSpentNow > maxSugar){
                maxSugar = sugarSpentNow;
            }
            if(flourSpentNow > maxFlour){
                maxFlour = flourSpentNow;
            }
        }
        double sugarPackets = Math.ceil(1.0 * totalSugarSpent / 950);
        double flourPackets = Math.ceil(1.0 * totalFlourSpent / 750);

        System.out.printf("Sugar: %.0f%n", sugarPackets);
        System.out.printf("Flour: %.0f%n", flourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
