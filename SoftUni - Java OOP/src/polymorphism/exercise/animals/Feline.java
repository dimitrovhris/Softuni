package polymorphism.exercise.animals;

public abstract class Feline extends Mammal{

    public Feline(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }



    @Override
    public void eat(Food food) {

    }
}
