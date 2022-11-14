import java.text.DecimalFormat;

public class Car extends Vehicle {
    public Car(double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.90);
    }

    @Override
    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("0.##");
        double litersUsed = (distance) * getFuelConsumption();
        if (getFuelQuantity() - litersUsed >= 0) {
            setFuelQuantity(getFuelQuantity() - litersUsed);
            return "Car travelled " + df.format(distance) + " km";
        } else{
            return "Car needs refueling";
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelQuantity(getFuelQuantity() + fuel);
    }

}
