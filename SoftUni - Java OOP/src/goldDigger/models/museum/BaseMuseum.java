package goldDigger.models.museum;

import java.util.Collection;
import java.util.List;

public class BaseMuseum implements Museum{
    private List<String> exhibits;

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }
}
