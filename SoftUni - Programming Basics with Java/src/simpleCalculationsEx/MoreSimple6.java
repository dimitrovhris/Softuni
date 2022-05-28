package simpleCalculationsEx;
import java.util.Scanner;
public class MoreSimple6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(readData.nextLine());
        double cacaPrice = readData.nextDouble();
        double palamudKG = readData.nextDouble();
        double safridKG = readData.nextDouble();
        int midiKG = readData.nextInt();

        double palamudPrice = skumriqPrice + 0.6 * skumriqPrice;
        double safridPrice = cacaPrice + 0.8 * cacaPrice;

        double palamudCost = palamudKG * palamudPrice;
        double safridCost = safridKG * safridPrice;
        double midiCost = midiKG * 7.50;

        double totalSum = palamudCost + safridCost + midiCost;
        System.out.printf("%.2f", totalSum);

    }
}
