package zoo.entities.animals;

import zoo.common.ExceptionMessages.*;

import static zoo.common.ExceptionMessages.*;

public abstract class BaseAnimal implements Animal{
    private String name;
    private String kind;
    protected double kg;
    private double price;

    public BaseAnimal(String name, String kind, double kg, double price) {
        setName(name);
        setKind(kind);
        setPrice(price);
        this.kg = kg;
    }
    private void setName(String name){
        if(name == null || name.equals("") || name.equals(" ")){
            throw new NullPointerException(AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
    private void setKind(String kind){
        if(kind == null || kind.equals("") || kind.equals(" ")){
            throw new NullPointerException(ANIMAL_KIND_NULL_OR_EMPTY);
        }
        this.kind = kind;
    }
    private void setPrice(double price){
        if(price <= 0){
            throw new IllegalArgumentException(ANIMAL_PRICE_BELOW_OR_EQUAL_ZERO);
        }
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getKg() {
        return kg;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public abstract void eat();
}
