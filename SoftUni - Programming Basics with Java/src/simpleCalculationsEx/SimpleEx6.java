package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nylonNeed = Integer.parseInt(sc.nextLine()) + 2;
		int paintNeed = Integer.parseInt(sc.nextLine());
		int thinnerNeed = Integer.parseInt(sc.nextLine());
		int totalHours = Integer.parseInt(sc.nextLine());

		double bagSum = 0.40;
		double materialsSum = nylonNeed * 1.50 + (paintNeed + 0.10 * paintNeed) * 14.50 + thinnerNeed * 5.00 + bagSum ;
		double workmenSum = (0.30 * materialsSum) * totalHours;
		double totalSum = materialsSum + workmenSum;

		System.out.printf("%.2f", totalSum);

	}

}
