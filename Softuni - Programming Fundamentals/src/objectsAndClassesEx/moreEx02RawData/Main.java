package objectsAndClassesEx.moreEx02RawData;

import java.lang.invoke.SerializedLambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String[] inputData = sc.nextLine().split(" ");
            String model = inputData[0];
            int engineSpeed = Integer.parseInt(inputData[1]);
            int enginePower = Integer.parseInt(inputData[2]);
            int cargoWeight = Integer.parseInt(inputData[3]);
            String cargoType = inputData[4];
            double tire1Pressure = Double.parseDouble(inputData[5]);
            int tire1Age = Integer.parseInt(inputData[6]);
            double tire2Pressure = Double.parseDouble(inputData[7]);
            int tire2Age = Integer.parseInt(inputData[8]);
            double tire3Pressure = Double.parseDouble(inputData[9]);
            int tire3Age = Integer.parseInt(inputData[10]);
            double tire4Pressure = Double.parseDouble(inputData[11]);
            int tire4Age = Integer.parseInt(inputData[12]);
            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tire1Pressure, tire1Age, tire2Pressure, tire2Age,
                    tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            cars.add(car);
        }

        String secondCommand = sc.nextLine();
        if (secondCommand.equals("fragile")) {
            for (Car item : cars) {
                if (item.getCargoType().equals("fragile") && (
                        item.getTire1Pressure() < 1 ||
                        item.getTire2Pressure() < 1 ||
                        item.getTire3Pressure() < 1 ||
                        item.getTire4Pressure() < 1)){
                    System.out.println(item.getModel());
                }
            }
        }
        else{
            for(Car item: cars){
                if(item.getCargoType().equals("flamable") && item.getEnginePower() > 250){
                    System.out.println(item.getModel());
                }
            }
        }
    }
}
