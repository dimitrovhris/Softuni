package simpleCalculations;

import java.util.Scanner;

public class Simple7 {

	public static void main(String[] args) {
		
		Scanner readData = new Scanner(System.in);
		double squareMeters = Double.parseDouble(readData.nextLine());
		
		double price = squareMeters * 7.61;
		double discount = 0.18 * price;
		double totalPrice = price - discount;
		
		System.out.printf("The final price is: %.2f lv.\n" , totalPrice);
		System.out.printf("The discount is: %.2f lv.", discount);
		
		

	}

}
