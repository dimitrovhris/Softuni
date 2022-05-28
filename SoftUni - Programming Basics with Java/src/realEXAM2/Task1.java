package realEXAM2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paintBoxes = Integer.parseInt(sc.nextLine());
        int wallpaperRolls = Integer.parseInt(sc.nextLine());
        double glovesPrice = Double.parseDouble(sc.nextLine());
        double brushPrice = Double.parseDouble(sc.nextLine());

        double paintSum = paintBoxes * 21.50;
        double wallpaperSum = wallpaperRolls * 5.20;
        double gloves = Math.ceil(0.35 * wallpaperRolls);
        double brushes = Math.floor(0.48 * paintBoxes);

        double glovesSum = gloves * glovesPrice;
        double brushesSum = brushes * brushPrice;

        double totalSum = paintSum + wallpaperSum + glovesSum + brushesSum;
        double deliverySum = 1.0 * 1 / 15 * totalSum;
        System.out.printf("This delivery will cost %.2f lv.", deliverySum);
    }
}
