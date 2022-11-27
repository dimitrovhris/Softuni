package goldDigger.models.spot;

import java.util.Collection;
import java.util.List;

public class SpotImpl implements Spot{
    private String name;
    private List<String> exhibits;

    public SpotImpl(String name) {
        setName(name);
    }

    private void setName(String name){
        if(name == null || name.length() == 0){
            throw new NullPointerException("Discoverer name cannot be null or empty.");
        }
        this.name = name;
    }
    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    @Override
    public String getName() {
        return name;
    }
}
