package zoo.repositories;

import zoo.entities.foods.Food;
import zoo.entities.foods.Meat;
import zoo.entities.foods.Vegetable;

import java.util.List;

public class FoodRepositoryImpl implements FoodRepository {
    private List<Food> foods;

    @Override
    public void add(Food food) {
        foods.add(food);
    }

    @Override
    public boolean remove(Food food) {
        return foods.removeIf(f -> f == food);
    }

    @Override
    public Food findByType(String type) {
        for (Food food : foods) {
            if (type.equals("Vegetable")) {
                if (food instanceof Vegetable) {
                    return food;
                }
            } else {
                if (food instanceof Meat) {
                    return food;
                }
            }
        }
        return null;
    }
}
