package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx3 {

	public static void main(String[] args) {
		Scanner readData = new Scanner(System.in);
		
		double deposedSum = Double.parseDouble(readData.nextLine());
		int months = Integer.parseInt(readData.nextLine());
		double percent = Double.parseDouble(readData.nextLine());

		double sum = deposedSum + months * ((deposedSum * percent/100) / 12);

		System.out.printf("%.2f", sum);
	}
}
