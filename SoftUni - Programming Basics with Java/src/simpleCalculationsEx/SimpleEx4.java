package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx4 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int totalSheets = Integer.parseInt(sc.nextLine());
			int sheetsForHour = Integer.parseInt(sc.nextLine());
			int days = Integer.parseInt(sc.nextLine());

			int hoursNeed = totalSheets / sheetsForHour;

			int hoursForDay = hoursNeed / days;

		System.out.println(hoursForDay);

		}

}
