package setsAndMaps;

import java.util.*;

public class Ex01ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> cars = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] data = input.split(", ");
            if (data[0].equals("IN")) {
                cars.add(data[1]);
            } else {
                cars.remove(data[1]);
            }
            input = sc.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
