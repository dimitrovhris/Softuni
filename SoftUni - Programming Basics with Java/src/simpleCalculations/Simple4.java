package simpleCalculations;

import java.util.Scanner;

public class Simple4 {

	public static void main(String[] args) {
		
	Scanner readInch = new Scanner (System.in);
	double inches = Double.parseDouble(readInch.nextLine());
	double cm = inches * 2.54;
	System.out.println(cm);
	 

	}

}

