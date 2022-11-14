package polymorphism.exercise.animals;

public class Tiger extends Feline{
    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }
}
