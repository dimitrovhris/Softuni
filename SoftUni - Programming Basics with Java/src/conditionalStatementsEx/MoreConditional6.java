package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int days = Integer.parseInt(readData.nextLine());
        int kgFood = Integer.parseInt(readData.nextLine());
        double dogFoodKg = Double.parseDouble(readData.nextLine());
        double catFoodKg = Double.parseDouble(readData.nextLine());
        double turtleFoodG = Double.parseDouble(readData.nextLine());

        double totalDogFood = dogFoodKg * days;
        double totalCatFood = catFoodKg * days;
        double totalTurtleFood = turtleFoodG / 1000 * days;

        double totalFood = totalDogFood + totalCatFood + totalTurtleFood;

        if (totalFood > kgFood){
            double kilosNeed = Math.ceil(totalFood - kgFood);
            System.out.printf("%.0f more kilos of food are needed.", kilosNeed);
        }
        else {
            double moreKilos = Math.floor(kgFood - totalFood);
            System.out.printf("%.0f kilos of food left.", moreKilos);
        }
    }


}
