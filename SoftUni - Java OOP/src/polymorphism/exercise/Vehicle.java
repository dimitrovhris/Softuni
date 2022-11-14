package polymorphism.exercise;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    private final double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("0.##");
        double litersUsed = (distance) * getFuelConsumption();
        if (getFuelQuantity() - litersUsed >= 0) {
            setFuelQuantity(getFuelQuantity() - litersUsed);
            return this.getClass().getSimpleName() + " travelled " + df.format(distance) + " km";
        } else {
            return this.getClass().getSimpleName() + " needs refueling";
        }
    }

    public void refuel(double fuel) {
        if (fuel <= 0) {
            System.out.println("Fuel must be a positive number");
        } else {
            if (getFuelQuantity() + fuel <= getTankCapacity()) {
                setFuelQuantity(getFuelQuantity() + fuel);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        }
    }
}
