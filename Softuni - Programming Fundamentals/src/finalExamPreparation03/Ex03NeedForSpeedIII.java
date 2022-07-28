package finalExamPreparation03;

import java.util.*;

public class Ex03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Integer>> cars = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            String car = input.split("\\|")[0];
            int mileage = Integer.parseInt(input.split("\\|")[1]);
            int fuel = Integer.parseInt(input.split("\\|")[2]);
            cars.put(car, new ArrayList<>());
            cars.get(car).add(mileage);
            cars.get(car).add(fuel);
        }
        String input = sc.nextLine();
        while(!input.equals("Stop")){
            String command = input.split(" : ")[0];
            String car = input.split(" : ")[1];
            int currentCarMileage = cars.get(car).get(0);
            int currentCarFuel = cars.get(car).get(1);
            switch (command){
                case "Drive":
                    int distance = Integer.parseInt(input.split(" : ")[2]);
                    int fuel = Integer.parseInt(input.split(" : ")[3]);
                    if(fuel > currentCarFuel){
                        System.out.println("Not enough fuel to make that ride");
                    }
                    else{
                        cars.get(car).set(0, currentCarMileage + distance);
                        cars.get(car).set(1, currentCarFuel - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    currentCarMileage = cars.get(car).get(0);
                    if(currentCarMileage >= 100000){
                        System.out.printf("Time to sell the %s!%n", car);
                        cars.remove(car);
                    }
                    break;
                case "Refuel":
                    int fuelToRefuel = Integer.parseInt(input.split(" : ")[2]);
                    if(currentCarFuel + fuelToRefuel > 75){
                        int total = currentCarFuel + fuelToRefuel;
                        int remain = total - 75;
                        System.out.printf("%s refueled with %d liters%n", car, fuelToRefuel - remain);
                        currentCarFuel = 75;
                    }
                    else{
                        currentCarFuel += fuelToRefuel;
                        System.out.printf("%s refueled with %d liters%n", car, fuelToRefuel);
                    }
                    cars.get(car).set(1, currentCarFuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(input.split(" : ")[2]);
                    cars.get(car).set(0, cars.get(car).get(0) - kilometers);
                    if(cars.get(car).get(0) >= 10000){
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    else{
                        cars.get(car).set(0, 10000);
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
