	package simpleCalculations;

	import java.util.Scanner;
	
	public class Simple2 {
			public static void main(String[] args) {
				
			
		Scanner readData = new Scanner (System.in);
		String firstName = readData.nextLine();
		String lastName = readData.nextLine();
		int age = Integer.parseInt(readData.nextLine());
		String town = readData.nextLine();
		
		System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
		
	}

}
