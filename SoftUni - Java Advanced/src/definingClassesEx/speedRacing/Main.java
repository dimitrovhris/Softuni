package definingClassesEx.speedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] data = sc.nextLine().split(" ");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fueCostFor1Kilometer = Double.parseDouble(data[2]);
            Car car = new Car(model, fuelAmount, fueCostFor1Kilometer);
            cars.put(model, car);
        }
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String driveModel = data[1];
            double kilometers = Double.parseDouble(data[2]);
            Car currentCar = cars.get(driveModel);
            if (currentCar.getFuelCostFor1Kilometer() * kilometers <= currentCar.getFuelAmount()) {
                currentCar.setDistanceTravelled(currentCar.getDistanceTravelled() + kilometers);
                currentCar.setFuelAmount(currentCar.getFuelAmount() - currentCar.getFuelCostFor1Kilometer() * kilometers);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }
            cars.put(driveModel, currentCar);
            input = sc.nextLine();
        }
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.printf("%s %.2f %.0f%n",
                    entry.getValue().getModel(),
                    entry.getValue().getFuelAmount(),
                    entry.getValue().getDistanceTravelled());
        }

    }
}
