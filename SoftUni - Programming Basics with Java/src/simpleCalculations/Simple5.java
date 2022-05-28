package simpleCalculations;

import java.util.Scanner;

public class Simple5 {

	public static void main(String[] args) {
		Scanner readData = new Scanner (System.in);
		
		String name = readData.nextLine();
		int projectsCount = Integer.parseInt(readData.nextLine());
		
		int hours = projectsCount * 3;
		
		System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours,
				projectsCount);

	}

}
