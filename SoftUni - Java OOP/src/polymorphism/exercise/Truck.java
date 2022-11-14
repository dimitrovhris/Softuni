package polymorphism.exercise;

public class Truck extends Vehicle {

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.60, tankCapacity);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }

}
