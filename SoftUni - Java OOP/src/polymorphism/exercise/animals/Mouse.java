package polymorphism.exercise.animals;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";
    }

    @Override
    public void eat(Food food) {

    }
}
