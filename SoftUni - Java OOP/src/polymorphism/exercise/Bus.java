package polymorphism.exercise;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    public void driveFull(double distance){
        setFuelConsumption(getFuelConsumption() + 1.4);
        System.out.println(drive(distance));
        setFuelConsumption(getFuelConsumption() - 1.4);
    }
}
