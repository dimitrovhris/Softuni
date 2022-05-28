package exExam3;

import java.util.Scanner;

public class exam35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double trunkCapacity = Double.parseDouble(sc.nextLine());
        String input = sc.nextLine();
        double capacityNow = 0;
        int suitcases = 0;
        while(!input.equals("End") && capacityNow <= trunkCapacity){
            double inputCapacity = Double.parseDouble(input);
            capacityNow += inputCapacity;
            if(capacityNow < trunkCapacity){
                suitcases++;
                input = sc.nextLine();
            }
        }
        if(input.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        else{
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcases);
    }
}
