package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int penPackets = Integer.parseInt(sc.nextLine());
		int markersPackets = Integer.parseInt(sc.nextLine());
		int detergentLiters = Integer.parseInt(sc.nextLine());
		double percent = Integer.parseInt(sc.nextLine());

		double totalPrice = (penPackets * 5.80 + markersPackets * 7.20 + detergentLiters * 1.20);
		double realPrice = totalPrice - (percent / 100 * totalPrice);
		System.out.println(realPrice);
				 

	}

}
