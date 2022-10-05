package definingClasses.carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Car> cars = new ArrayList<>();
        while(n-- > 0){
            String[] data = sc.nextLine().split("\\s+");
            Car car = new Car();
            car.setBrand(data[0]);
            car.setModel(data[1]);
            car.setHorsePower(Integer.parseInt(data[2]));
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car.carInfo(car.getBrand(), car.getModel(), car.getHorsePower()));
        }
    }
}
