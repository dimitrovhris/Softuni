package polymorphism.exercise.animals;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Zs";
    }

    @Override
    public void eat(Food food) {

    }
}
