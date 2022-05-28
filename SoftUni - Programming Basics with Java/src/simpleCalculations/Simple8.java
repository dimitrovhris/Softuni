package simpleCalculations;

import java.util.Scanner;

public class Simple8 {

	public static void main(String[] args) {
		Scanner readData = new Scanner(System.in);
		double length = Double.parseDouble(readData.nextLine());
		double width = Double.parseDouble(readData.nextLine());
		double hight = Double.parseDouble(readData.nextLine());
		double percent = Double.parseDouble(readData.nextLine());
		
		double volume = length * width * hight;
		double volumeLiters = 0.001 * volume;
		double realPercent = 0.01 * percent;
		
		double totalVolume = volumeLiters - realPercent * volumeLiters;
		
		System.out.printf("%.3f L", totalVolume );

		
		
		
		}

}
