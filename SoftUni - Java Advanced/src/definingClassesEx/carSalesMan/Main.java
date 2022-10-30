package definingClassesEx.carSalesMan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();
        ArrayList<Car> cars = new ArrayList<>();
        while(n -- > 0){
            String[] data = sc.nextLine().split(" ");
            Engine engine = createNewEngine(data);
            engines.put(data[0], engine);
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m -- > 0){
            String[] data = sc.nextLine().split(" ");
            Car car = createNewCar(data, engines);
            cars.add(car);
        }
        cars.forEach(System.out::println);
    }
    public static Engine createNewEngine(String[] data){
        Engine engine = null;
        switch(data.length){
            case 4:
                engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
                break;
            case 3:
                if(Character.isUpperCase(data[2].charAt(0))){
                    engine = new Engine(data[0], Integer.parseInt(data[1]), data[2]);
                } else{
                    engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                }
                break;
            case 2:
                engine = new Engine(data[0], Integer.parseInt(data[1]));
                break;
        }
        return engine;
    }
    public static Car createNewCar(String[] data, Map<String, Engine> engines){
        Car car = null;
        switch(data.length){
            case 4:
                car = new Car(data[0], engines.get(data[1]), Integer.parseInt(data[2]), data[3]);
                break;
            case 3:
                if(Character.isDigit(data[2].charAt(0))){
                    car = new Car(data[0], engines.get(data[1]), Integer.parseInt(data[2]));
                } else{
                    car = new Car(data[0], engines.get(data[1]), data[2]);
                }
                break;
            case 2:
                car = new Car(data[0], engines.get(data[1]));
        }
        return car;
    }
}
