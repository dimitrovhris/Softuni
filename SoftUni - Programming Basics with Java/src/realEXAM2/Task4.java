package realEXAM2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cats = Integer.parseInt(sc.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        double totalGrams = 0;
        for(int i = 1; i <= cats; i++){
            double gramsNow = Double.parseDouble(sc.nextLine());
            if(gramsNow >= 100 && gramsNow < 200){
                group1++;
            }
            else if(gramsNow < 300){
                group2++;
            }
            else{
                group3++;
            }
            totalGrams += gramsNow;
        }
        double kilos = totalGrams / 1000;
        double totalSum = kilos * 12.45;
        System.out.printf("Group 1: %d cats.%n", group1);
        System.out.printf("Group 2: %d cats.%n", group2);
        System.out.printf("Group 3: %d cats.%n", group3);
        System.out.printf("Price for food per day: %.2f lv.", totalSum);
    }
}
