package definingClassesEx.rawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Car> cars = new ArrayList<>();
        while (n -- > 0){
            String[] data = sc.nextLine().split(" ");
            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            ArrayList<Tire> tires = new ArrayList<>();
            for(int i = 5; i < 12; i+=2){
                tires.add(new Tire(Double.parseDouble(data[i]), Double.parseDouble(data[i+1])));
            }
            Car car = new Car(model, new Engine(engineSpeed, enginePower), new Cargo(cargoWeight, cargoType), tires);
            cars.add(car);
        }
        String input = sc.nextLine();
        Function<Tire, Boolean> tireFunction = t -> t.getPressure() < 1;
        if(input.equals("fragile")){
            for (Car car : cars) {
                for (Tire tire : car.getTire()) {
                    if(tireFunction.apply(tire)){
                        System.out.println(car.getModel());
                        break;
                    }
                }
            }
        } else{
            cars.stream()
                    .filter(e -> e.getEngine().getPower() > 250)
                    .forEach(e -> System.out.println(e.getModel()));
        }
    }
}
