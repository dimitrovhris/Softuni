package polymorphism.exercise.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s[%s, %s, %d]", getClass().getSimpleName(), getAnimalName(),
                decimalFormat.format(getAnimalWeight()), getFoodEaten()) + System.lineSeparator() + makeSound();
    }
    public abstract String makeSound();
}
