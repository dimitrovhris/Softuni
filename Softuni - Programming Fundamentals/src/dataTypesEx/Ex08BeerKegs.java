package dataTypesEx;

import java.util.Scanner;

public class Ex08BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String biggestKeg = "";
        for(int i = 1; i <= n; i++){
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if(volume > maxVolume){
                maxVolume = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
