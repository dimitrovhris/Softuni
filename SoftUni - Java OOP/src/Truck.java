public class Truck extends Vehicle{
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.60);
    }

    @Override
    public String drive(String distance) {
        double litersUsed = Double.parseDouble(distance) * getFuelConsumption();
        if (getFuelQuantity() - litersUsed >= 0) {
            setFuelQuantity(getFuelQuantity() - litersUsed);
            return "Truck travelled " + distance + " km";
        } else{
            return "Truck needs refueling";
        }
    }


    @Override
    public void refuel(double fuel) {
        setFuelQuantity(getFuelQuantity() + (fuel * 0.95));
    }
}
