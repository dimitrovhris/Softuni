package inheritenceEx;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new Car(98, 200);
        System.out.println(sportCar.getHorsePower());
        System.out.println(sportCar.getFuel());
        System.out.println(sportCar.getFuelConsumption());
        sportCar.drive(5);
        System.out.println(sportCar.getFuel());
    }
}
