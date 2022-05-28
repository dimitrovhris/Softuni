package conditionalStatements;
import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		
		Scanner readData = new Scanner(System.in);
		double grade = Double.parseDouble(readData.nextLine());
		
		if (grade >= 5.00) {
				System.out.println("Excellent!");
		}


		
		

	}

}
