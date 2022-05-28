package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int chickenMenus = Integer.parseInt(sc.nextLine());
		int fishMenus = Integer.parseInt(sc.nextLine());
		int veganMenus = Integer.parseInt(sc.nextLine());

		double chickenSum = chickenMenus * 10.35;
		double fishSum = fishMenus * 12.40;
		double veganSum = veganMenus * 8.15;
		double menuSum = chickenSum + fishSum + veganSum;
		double dessertSum = 0.20 * menuSum;

		double totalSum = menuSum + dessertSum + 2.50;
		System.out.print( totalSum);

	}

}
