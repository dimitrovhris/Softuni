package simpleCalculations;

import java.util.Scanner;

public class Simple6 {

	public static void main(String[] args) {
		
		Scanner readData = new Scanner(System.in);
		int dogsCount = Integer.parseInt(readData.nextLine());
		int otherAnimalsCount = Integer.parseInt(readData.nextLine());
		
		double dogsFood = dogsCount * 2.50;
		double otherFood = otherAnimalsCount * 4;
		
		double totalSum = dogsFood + otherFood;
		System.out.printf("%.2f lv.",totalSum ); 

	}

}
