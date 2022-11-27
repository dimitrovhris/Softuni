package goldDigger.models.discoverer;

import goldDigger.models.museum.Museum;

import java.util.Collection;

public interface Discoverer {
    String getName();

    double getEnergy();

    boolean canDig();

    Museum getMuseum();

    void dig();
}
