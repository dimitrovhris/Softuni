package dataTypesEx;

import java.util.Scanner;

public class Ex09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yieldLeft = Integer.parseInt(sc.nextLine());
        int days = 0;
        int totalExtracted = 0;
        while(yieldLeft >= 100){
            int yieldExtractedToday = yieldLeft - 26;
            totalExtracted += yieldExtractedToday;
            yieldLeft -= 10;
            days++;
            if(yieldLeft < 100){
                totalExtracted -= 26;
            }
        }
        System.out.println(days);
        System.out.println(totalExtracted);
    }
}
