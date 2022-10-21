package easterBasket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket (String material, int capacity) {
        this.data = new ArrayList<>();
        this.material = material;
        this.capacity = capacity;
    }
    public void addEgg(Egg egg){
        if(data.size() < capacity){
            data.add(egg);
        }
    }
    public boolean removeEgg(String color){
        for(Egg egg: data){
            if(egg.getColor().equals(color)){
                data.remove(egg);
                return true;
            }
        }
        return false;
    }
    public Egg getStrongestEgg(){
        Egg strongestEgg = data.stream().max(Comparator.comparing(Egg::getStrength)).get();
        return strongestEgg;
    }
    public Egg getEgg(String color){
        for(Egg egg: data){
            if(egg.getColor().equals(color)){
                return egg;
            }
        }
        return null;
    }
    public int getCount(){
        return data.size();
    }
    public String report(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(material).append(" basket contains:").append(System.lineSeparator());
        data.forEach(e -> stringBuilder.append(e).append(System.lineSeparator()));
        return stringBuilder.toString();
    }
}
