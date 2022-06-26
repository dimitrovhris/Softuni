package midExam;

import java.util.Scanner;

public class Ex01TheHuntingGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        int players = Integer.parseInt(sc.nextLine());
        double energy = Double.parseDouble(sc.nextLine());
        double waterPerDay = Double.parseDouble(sc.nextLine());
        double foodPerDay = Double.parseDouble(sc.nextLine());
        double totalWater = days * players * waterPerDay;
        double totalFood = days * players * foodPerDay;
        boolean enoughEnergy = true;
        for(int i = 1; i <= days; i++){
            double energyLoss = Double.parseDouble(sc.nextLine());
            energy -= energyLoss;
            if(energy <= 0){
                enoughEnergy = false;
                break;
            }
            if(i % 2 == 0){
                energy += 0.05 * energy;
                totalWater -= totalWater * 0.3;
            }
            if(i % 3 == 0){
                energy += 0.1 * energy;
                totalFood -= totalFood / players;
            }
        }
        if(enoughEnergy){
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
        else{
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
