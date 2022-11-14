import java.text.DecimalFormat;

public class Truck extends Vehicle{
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.60);
    }

    @Override
    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("0.##");
        double litersUsed = (distance) * getFuelConsumption();
        if (getFuelQuantity() - litersUsed >= 0) {
            setFuelQuantity(getFuelQuantity() - litersUsed);
            return "Truck travelled " + df.format(distance) + " km";
        } else{
            return "Truck needs refueling";
        }
    }


    @Override
    public void refuel(double fuel) {
        setFuelQuantity(getFuelQuantity() + (fuel * 0.95));
    }
}
