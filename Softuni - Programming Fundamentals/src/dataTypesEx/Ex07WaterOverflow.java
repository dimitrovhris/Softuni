package dataTypesEx;

import java.util.Scanner;

public class Ex07WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int totalLiters = 0;
        for(int i = 1; i <= n; i++){
            int addedWater = Integer.parseInt(sc.nextLine());
            totalLiters += addedWater;
            if(totalLiters > 255){
                System.out.println("Insufficient capacity!");
                totalLiters -= addedWater;
            }
        }
        System.out.println(totalLiters);
    }
}
