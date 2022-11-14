package polymorphism.exercise;

public class Car extends Vehicle {
    public Car(double fuelQuantity, Double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.90, tankCapacity);
    }


}
