package objectsAndClassesEx.ex06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        double averageCarHorsePower;
        double averageTruckHorsePower;
        int cars = 0;
        int trucks = 0;
        double totalCarPower = 0;
        double totalTruckPower = 0;
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            double horsePower = Double.parseDouble(data[3]);
            if(type.equals("car")){
                cars++;
                totalCarPower += horsePower;
            }
            else{
                trucks++;
                totalTruckPower += horsePower;
            }
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while(!input.equals("Close the Catalogue")){
            for(Vehicle item: vehicleList){
                if(item.getModel().equals(input)){
                    System.out.println(item);
                }
            }
            input = sc.nextLine();
        }
        if(cars == 0){
            averageCarHorsePower = 0;
        }
        else{
            averageCarHorsePower = totalCarPower / cars;
        }
        if(trucks == 0){
            averageTruckHorsePower = 0;
        }
        else{
            averageTruckHorsePower = totalTruckPower / trucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsePower);
    }
}
