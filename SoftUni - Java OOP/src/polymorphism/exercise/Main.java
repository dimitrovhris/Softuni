package polymorphism.exercise;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carData = sc.nextLine().split(" ");
        String[] truckData = sc.nextLine().split(" ");
        String[] busData = sc.nextLine().split(" ");
        double carQuantity = Double.parseDouble(carData[1]);
        double carConsumption = Double.parseDouble(carData[2]);
        double carCapacity = Double.parseDouble(carData[3]);
        double truckQuantity = Double.parseDouble(truckData[1]);
        double truckConsumption = Double.parseDouble(truckData[2]);
        double truckCapacity = Double.parseDouble(truckData[3]);
        double busQuantity = Double.parseDouble(busData[1]);
        double busConsumption = Double.parseDouble(busData[2]);
        double busCapacity = Double.parseDouble(busData[3]);
        Vehicle car = new Car(carQuantity, carConsumption, carCapacity);
        Vehicle truck = new Truck(truckQuantity, truckConsumption, truckCapacity);
        Bus bus = new Bus(busQuantity, busConsumption, busCapacity);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String[] commandData = sc.nextLine().split(" ");
            double  number = Double.parseDouble(commandData[2]);
            switch(commandData[0]){
                case "Drive":
                    if(commandData[1].equals("polymorphism.exercise.Car")){
                        System.out.println(car.drive(number));
                    } else if(commandData[1].equals("polymorphism.exercise.Truck")){
                        System.out.println(truck.drive(number));
                    } else{
                        bus.driveFull(number);
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.drive(number));
                    break;
                case "Refuel":
                    if(commandData[1].equals("polymorphism.exercise.Car")){
                        car.refuel(number);
                    } else if(commandData[1].equals("polymorphism.exercise.Truck")){
                        truck.refuel(number);
                    } else{
                        bus.refuel(number);
                    }
                    break;
            }
        }

        System.out.printf("polymorphism.exercise.Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("polymorphism.exercise.Truck: %.2f%n", (truck.getFuelQuantity()));
        System.out.printf("polymorphism.exercise.Bus: %.2f", bus.getFuelQuantity());
    }
}
