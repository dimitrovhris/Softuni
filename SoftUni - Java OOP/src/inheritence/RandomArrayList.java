package inheritence;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {
    public Object getRandomElement(){
        Random random = new Random();
        int randomIndex = random.nextInt(0, size());
        return this.get(randomIndex);
    }
}
