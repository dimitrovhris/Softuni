public class CarImpl implements Car{
    protected String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public Integer getHorsePower() {
        return null;
    }

    @Override
    public String countryProduced() {
        return null;
    }
    public String toString(){
        return String.format("%s is %s color and have %d horsePower%n" +
                "This is %s produced in %s and have %d tires", model, color, horsePower, model, countryProduced, Seat.TIRES);
    }
}
