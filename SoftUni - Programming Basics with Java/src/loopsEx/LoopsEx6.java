package loopsEx;

import java.util.Scanner;

public class LoopsEx6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int n = Integer.parseInt(readData.nextLine());
        double salary = Double.parseDouble(readData.nextLine());
        double penalty = 0;
        double penaltySum = 0;
        double newSalary = salary;
        boolean under0 = false;


        for (int i = 1; i <= n; i++) {
            String site = readData.nextLine();
            boolean inSite = false;
            if (site.equals("Facebook")) {
                penalty = 150;
                inSite = true;
            } else if (site.equals("Instagram")) {
                penalty = 100;
                inSite = true;
            } else if (site.equals("Reddit")) {
                penalty = 50;
                inSite = true;
            }
            if (inSite) {
                newSalary -= penalty;
            }
            if (newSalary <= 0) {
                System.out.println("You have lost your salary.");
                under0 = true;
                break;
            }
        }
        if (newSalary > 0) {
            System.out.printf("%.0f", newSalary);
        }

    }
}
