package simpleCalculations;

import java.util.Scanner;

public class Simple3 {

	public static void main(String[] args) {
		
		Scanner readSide = new Scanner (System.in);
		int side = Integer.parseInt(readSide.nextLine());
		
		int area = side * side;
		
		System.out.println(area);

	}

}
