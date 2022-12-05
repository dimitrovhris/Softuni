package zoo.entities.areas;

import zoo.common.ExceptionMessages;
import zoo.entities.animals.Animal;
import zoo.entities.foods.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static zoo.common.ExceptionMessages.AREA_NAME_NULL_OR_EMPTY;
import static zoo.common.ExceptionMessages.NOT_ENOUGH_CAPACITY;

public abstract class BaseArea implements Area {
    private String name;
    private int capacity;
    private List<Food> foods;
    private List<Animal> animals;

    public BaseArea(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
    }

    private void setName(String name) {
        if (name == null || name.equals("") || name.equals(" ")) {
            throw new NullPointerException(AREA_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int sumCalories() {
        int sum = 0;
        for (Food food : foods) {
            sum += food.getCalories();
        }
        return sum;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collection<Animal> getAnimals() {
        return animals;
    }

    @Override
    public Collection<Food> getFoods() {
        return foods;
    }

    @Override
    public void addAnimal(Animal animal) {
        if (animals.size() < capacity) {
            animals.add(animal);
        } else{
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }
    }

    @Override
    public void removeAnimal(Animal animal) {
        animals.removeIf(animal1 -> animal1 == animal);
    }

    @Override
    public void addFood(Food food) {
        foods.add(food);
    }

    @Override
    public void feed() {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s)", name, getClass().getSimpleName()));
        sb.append(System.lineSeparator());
        sb.append("Animals: ");
        if (animals.isEmpty()) {
            sb.append("none");
        } else {
            List<String> names = new ArrayList<>();
            for (Animal animal : animals) {
                names.add(animal.getName());
            }
            sb.append(String.join(", ", names));
        }
        sb.append(System.lineSeparator());
        sb.append(String.format("Foods: %d", foods.size()));
        sb.append(System.lineSeparator());
        sb.append("Calories: ").append(sumCalories());
        return sb.toString();
    }
}
