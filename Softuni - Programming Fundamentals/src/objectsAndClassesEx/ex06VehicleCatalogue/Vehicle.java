package objectsAndClassesEx.ex06VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private double horsePower;

    public Vehicle(String type, String model, String color, double horsePower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return this.horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }
    @Override
    public String toString(){
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f", this.getType().substring(0, 1).toUpperCase() + this.getType().substring(1),
                this.model, this.color, this.horsePower);
    }

}
