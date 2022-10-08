package definingClassesEx.carSalesMan;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    Car(String model, Engine engine, int weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }
    Car(String model, Engine engine, int weight){
        this(model, engine, weight, "n/a");
    }
    Car(String model, Engine engine, String color){
        this(model, engine, -1, color);
    }
    Car(String model, Engine engine){
        this(model, engine, -1, "n/a");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getWeight() {
        if(weight == -1){
            return "n/a";
        } else{
            return weight + "";
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return String.format("%s:\n%s:\nPower: %d\nDisplacement: %s\nEfficiency: %s\nWeight: %s\nColor: %s",
                this.getModel(), engine.getModel(), engine.getPower(), engine.getDisplacement(), engine.getEfficiency(), this.getWeight(), this.getColor());
    }
}
