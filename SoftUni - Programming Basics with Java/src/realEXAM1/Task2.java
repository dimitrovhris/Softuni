package realEXAM1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays = Integer.parseInt(sc.nextLine());
        int foodLeft = Integer.parseInt(sc.nextLine());
        double foodDeer1 = Double.parseDouble(sc.nextLine());
        double foodDeer2 = Double.parseDouble(sc.nextLine());
        double foodDeer3 = Double.parseDouble(sc.nextLine());

        double totalFood1 = foodDeer1 * totalDays;
        double totalFood2 = foodDeer2 * totalDays;
        double totalFood3 = foodDeer3 * totalDays;

        double totalFood = totalFood1 + totalFood2 + totalFood3;

        double moreLessFood = Math.abs(totalFood - foodLeft);
        if(foodLeft >= totalFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(moreLessFood));
        }
        else{
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(moreLessFood));
        }

    }
}
