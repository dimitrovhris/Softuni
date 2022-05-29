package dataTypesEx;

import java.util.Scanner;

public class Ex11Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double max = Double.MIN_VALUE;
        int snowballSnow;
        int snowballTime;
        int snowballQuality;
        int maxTime = 0;
        int maxSnow = 0;
        int maxQuality = 0;
        for(int i = 1; i <= n; i++){
             snowballSnow = Integer.parseInt(sc.nextLine());
             snowballTime = Integer.parseInt(sc.nextLine());
             snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow(1.0 * snowballSnow / snowballTime, snowballQuality );
            if(snowballValue > max){
                maxTime = snowballTime;
                maxSnow = snowballSnow;
                maxQuality = snowballQuality;
                max = snowballValue;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, max, maxQuality);
    }
}
