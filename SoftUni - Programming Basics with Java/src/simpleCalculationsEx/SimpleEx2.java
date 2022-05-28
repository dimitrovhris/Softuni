package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx2 {

	public static void main(String[] args) {
		
		Scanner readData = new Scanner(System.in);
		double rad = readData.nextDouble();
		
		double deg = rad * 180/ Math.PI;
		System.out.printf("%.0f", deg);

	}

}
