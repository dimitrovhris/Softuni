package goldDigger.models.discoverer;

import goldDigger.models.museum.Museum;

import java.util.Collection;

public abstract class BaseDiscoverer implements Discoverer{
    private String name;
    private double energy;
    private Museum museum;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public Museum getMuseum() {
        return museum;
    }

    public BaseDiscoverer(String name, double energy) {
        setName(name);
        setEnergy(energy);
    }

    private void setName(String name){
        if(name == null || name.length() == 0){
            throw new NullPointerException("Discoverer name cannot be null or empty.");
        }
        this.name = name;
    }
    private void setEnergy(double energy){
        if(energy < 0){
            throw  new IllegalArgumentException("Cannot create Discoverer with negative energy.");
        }
        this.energy = energy;
    }
    public void dig(){
        energy -= 15;
        if(energy < 0){
            energy = 0;
        }
    }
    public boolean canDig(){
        return energy > 0;
    }


}
