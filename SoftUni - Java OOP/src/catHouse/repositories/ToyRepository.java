package catHouse.repositories;

import catHouse.entities.toys.Ball;
import catHouse.entities.toys.Mouse;
import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.Collection;

public class ToyRepository implements Repository{
    private Collection<Toy> toys;

    public ToyRepository() {
        toys = new ArrayList<>();
    }

    @Override
    public void buyToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public boolean removeToy(Toy toy) {
        return toys.removeIf(t -> t == toy);
    }

    @Override
    public Toy findFirst(String type) {
        for(Toy toy: toys){
            if(type.equals("Ball")){
                if(toy instanceof Ball){
                    return toy;
                }
            } else if(type.equals("Mouse")){
                if(toy instanceof Mouse){
                    return toy;
                }
            }
        }
        return null;
    }
}
