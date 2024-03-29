package definingClasses.carInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public String carInfo(String brand, String model, int horsePower){
         return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
    }
}
