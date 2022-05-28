package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx1 {

	public static void main(String[] args) {
		Scanner readData = new Scanner(System.in);
		double usd = Double.parseDouble(readData.nextLine());
		double lv = usd * 1.79549;
		
		System.out.printf("%.2f", lv);

	}

}
