package goldDigger.repositories;

import goldDigger.models.discoverer.Discoverer;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class DiscovererRepository implements Repository<Discoverer> {
    private Map<String, Discoverer> discoverers;

    @Override
    public Collection<Discoverer> getCollection() {
        return Collections.unmodifiableCollection(discoverers.values());
    }

    @Override
    public void add(Discoverer discoverer) {

        discoverers.put(discoverer.getName(), discoverer);
    }

    @Override
    public boolean remove(Discoverer discoverer) {
        if(discoverers.containsKey(discoverer.getName())) {
            discoverers.remove(discoverer.getName());
            return true;
        }
        return false;
    }

    @Override
    public Discoverer byName(String name) {
        if(discoverers.containsKey(name)){
           return discoverers.get(name);
        }
        return null;
    }
}
