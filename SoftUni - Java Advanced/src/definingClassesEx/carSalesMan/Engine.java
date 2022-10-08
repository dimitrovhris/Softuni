package definingClassesEx.carSalesMan;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    Engine(String model, int power, int displacement, String efficiency){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }
    Engine(String model, int power, int displacement){
        this(model, power, displacement, "n/a");
    }
    Engine(String model, int power, String efficiency){
        this(model, power, -1, efficiency);
    }
    Engine(String model, int power){
        this(model, power, -1, "n/a");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        if(displacement == -1){
            return "n/a";
        } else{
            return displacement + "";
        }
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
}
