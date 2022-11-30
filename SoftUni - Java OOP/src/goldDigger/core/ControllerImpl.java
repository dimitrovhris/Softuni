package goldDigger.core;

import goldDigger.models.discoverer.Anthropologist;
import goldDigger.models.discoverer.Archaeologist;
import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.discoverer.Geologist;
import goldDigger.models.operation.Operation;
import goldDigger.models.operation.OperationImpl;
import goldDigger.models.spot.Spot;
import goldDigger.models.spot.SpotImpl;
import goldDigger.repositories.DiscovererRepository;
import goldDigger.repositories.SpotRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{
    private DiscovererRepository discovererRepository;
    private SpotRepository spotRepository;
    private int spotCount;
    @Override
    public String addDiscoverer(String kind, String discovererName) {
        Discoverer discoverer;
        switch (kind){
            case "Anthropologist":
                discoverer = new Anthropologist(discovererName);
                discovererRepository.add(discoverer);
                break;
            case "Archaeologist":
                discoverer = new Archaeologist(discovererName);
                discovererRepository.add(discoverer);
                break;
            case "Geologist":
                discoverer = new Geologist(discovererName);
                discovererRepository.add(discoverer);
                break;
            default:
                throw new IllegalArgumentException("Discoverer kind doesn't exists.");
        }
        return String.format("Added %s: %s.", kind, discovererName);
    }

    @Override
    public String addSpot(String spotName, String... exhibits) {
        Spot spot = new SpotImpl(spotName);
        spotRepository.add(spot);
        return String.format("Added spot: %s.", spotName);
    }

    @Override
    public String excludeDiscoverer(String discovererName) {
        for(Discoverer discoverer: discovererRepository.getCollection()){
            if(discoverer.getName().equals(discovererName)){
                discovererRepository.remove(discoverer);
                return String.format("Discoverer %s has excluded!", discovererName);
            }
        }
        throw new IllegalStateException("Discoverer %s doesn't exists.");
    }

    @Override
    public String inspectSpot(String spotName) {
        List<Discoverer> discoverers = discovererRepository.getCollection().stream()
                .filter(e -> e.getEnergy() > 45)
                .collect(Collectors.toList());
        int excluded = discoverers.size();
        if(discoverers.size() != 0){
            Spot spot = spotRepository.byName(spotName);
            Operation operation = new OperationImpl();
            operation.startOperation(spot, discoverers);
            spotCount++;
            return String.format("The spot %s was inspected. %d discoverers have been excluded on this operation.", spotName, excluded);
        }
        throw new IllegalArgumentException("You must have at least one discoverer to inspect the spot.");
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(spotCount).append("spots were inspected.");
        sb.append("Information for the discoverers:").append(System.lineSeparator());
        for(Discoverer discoverer: discovererRepository.getCollection()){
            sb.append(String.format("Name: %s", discoverer.getName()));
            sb.append(String.format("Energy: %.0f", discoverer.getEnergy()));
            sb.append("Museum exhibits: ");
            if(discoverer.getMuseum().getExhibits().isEmpty()){
                sb.append("None");
            } else{
                sb.append(String.join(", ", discoverer.getMuseum().getExhibits()));
            }
        }
        return sb.toString();
    }
}
