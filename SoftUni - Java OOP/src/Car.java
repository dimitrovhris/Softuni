public class Car extends Vehicle {
    public Car(double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.90);
    }

    @Override
    public String drive(String distance) {
        double litersUsed = Double.parseDouble(distance) * getFuelConsumption();
        if (getFuelQuantity() - litersUsed >= 0) {
            setFuelQuantity(getFuelQuantity() - litersUsed);
            return "Car travelled " + distance + " km";
        } else{
            return "Car needs refueling";
        }
    }

    @Override
    public void refuel(double fuel) {
        setFuelQuantity(getFuelQuantity() + fuel);
    }

}
