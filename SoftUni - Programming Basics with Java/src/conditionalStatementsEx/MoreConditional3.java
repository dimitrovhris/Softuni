package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional3 {
    public static void main(String[] args){
        Scanner readData = new Scanner(System.in);
        int lozeArea = Integer.parseInt(readData.nextLine());
        double kgGrozde1m = Double.parseDouble(readData.nextLine());
        int litersNeed = Integer.parseInt(readData.nextLine());
        int workers = Integer.parseInt(readData.nextLine());
        double rekoltaZaVino = 0.4 * lozeArea;
        double liters = rekoltaZaVino * kgGrozde1m / 2.5;
        if (liters >= litersNeed){
            double litersLeft = liters - litersNeed;
            double winePerPerson = Math.floor(litersLeft / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", liters);
            System.out.printf("%.0f liters left -> %.0f liters per person.", litersLeft, winePerPerson); }
        else{ double litersNeeded = litersNeed - liters;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", litersNeeded); } }}
