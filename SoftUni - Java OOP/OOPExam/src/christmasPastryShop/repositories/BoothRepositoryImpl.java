package christmasPastryShop.repositories;

import christmasPastryShop.entities.booths.interfaces.Booth;
import christmasPastryShop.repositories.interfaces.BoothRepository;
import christmasPastryShop.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BoothRepositoryImpl implements BoothRepository<Booth> {
    private List<Booth> models;

    public BoothRepositoryImpl() {
        models = new ArrayList<>();
    }

    @Override
    public Booth getByNumber(int number) {
        for(Booth booth: models){
            if(booth.getBoothNumber() == number){
                return booth;
            }
        }
        return null;
    }

    @Override
    public Collection<Booth> getAll() {
        return Collections.unmodifiableCollection(models);
    }

    @Override
    public void add(Booth model) {
        models.add(model);
    }
}
