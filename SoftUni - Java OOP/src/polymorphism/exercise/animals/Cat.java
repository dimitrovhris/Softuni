package polymorphism.exercise.animals;

import java.text.DecimalFormat;

public class Cat extends Feline{
    private String breed;
    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s[%s, %s %s, %d]", getClass().getSimpleName(), getAnimalName(), getBreed(),
                decimalFormat.format(getAnimalWeight()), getFoodEaten()) + System.lineSeparator() + makeSound();
    }

    @Override
    public String makeSound() {
        return "Meowwww";
    }

}
