package football.repositories;

import football.entities.supplement.Liquid;
import football.entities.supplement.Powdered;
import football.entities.supplement.Supplement;

import java.util.ArrayList;
import java.util.Collection;

public class SupplementRepositoryImpl implements SupplementRepository{
    private Collection<Supplement> supplements;

    public SupplementRepositoryImpl() {
        this.supplements = new ArrayList<>();
    }

    @Override
    public void add(Supplement supplement) {
        supplements.add(supplement);
    }

    @Override
    public boolean remove(Supplement supplement) {
        return supplements.removeIf(s -> s == supplement);
    }

    @Override
    public Supplement findByType(String type) {
        for(Supplement supplement: supplements){
            if(type.equals("Liquid")){
                if(supplement instanceof Liquid){
                    return supplement;
                }
            } else if(type.equals("Powdered")){
                if(supplement instanceof Powdered){
                    return supplement;
                }
            }
        }
        return null;
    }
}
