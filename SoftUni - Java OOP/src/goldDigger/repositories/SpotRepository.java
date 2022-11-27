package goldDigger.repositories;

import goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class SpotRepository implements Repository<Spot> {
    private Map<String, Spot> spots;
    @Override
    public Collection<Spot> getCollection() {
        return Collections.unmodifiableCollection(spots.values());
    }

    @Override
    public void add(Spot spot) {
        spots.put(spot.getName(), spot);
    }

    @Override
    public boolean remove(Spot spot) {
        if(spots.containsKey(spot.getName())){
            spots.remove(spot.getName());
            return true;
        }
        return false;
    }

    @Override
    public Spot byName(String name) {
        return spots.get(name);
    }
}
