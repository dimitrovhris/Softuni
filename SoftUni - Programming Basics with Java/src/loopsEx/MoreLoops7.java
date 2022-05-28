package loopsEx;
import java.util.Scanner;
public class MoreLoops7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        double totalSeats = Integer.parseInt(readData.nextLine());
        double totalFans = Integer.parseInt(readData.nextLine());
        double a = 0;
        double b = 0;
        double v = 0;
        double g = 0;

        for(int i = 1; i <= totalFans; i++){
            String sector = readData.nextLine();
            switch (sector){
                case "A" -> a++;
                case "B" -> b++;
                case "V" -> v++;
                case "G" -> g++;
            }
        }
        double percentA = a * 100 / totalFans;
        double percentB = b * 100 / totalFans;
        double percentV = v * 100 / totalFans;
        double percentG = g * 100 / totalFans;
        double totalPercent = totalFans * 100 / totalSeats;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", totalPercent);

    }
}
