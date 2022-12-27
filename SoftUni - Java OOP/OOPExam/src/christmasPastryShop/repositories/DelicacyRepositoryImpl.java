package christmasPastryShop.repositories;

import christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import christmasPastryShop.repositories.interfaces.DelicacyRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DelicacyRepositoryImpl implements DelicacyRepository<Delicacy> {
    private List<Delicacy> models;

    public DelicacyRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public Delicacy getByName(String name) {
        for(Delicacy delicacy: models){
            if (delicacy.getName().equals(name)){
                return delicacy;
            }
        }
        return null;
    }

    @Override
    public Collection<Delicacy> getAll() {
        return Collections.unmodifiableList(models);
    }

    @Override
    public void add(Delicacy delicacy) {

        models.add(delicacy);
    }

}
