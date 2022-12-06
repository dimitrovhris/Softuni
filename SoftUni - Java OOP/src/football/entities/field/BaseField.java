package football.entities.field;

import football.common.ExceptionMessages;
import football.entities.player.Player;
import football.entities.supplement.Supplement;
import football.common.ExceptionMessages.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static football.common.ExceptionMessages.FIELD_NAME_NULL_OR_EMPTY;

public abstract class BaseField implements Field{
    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Player> players;

    public BaseField(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        supplements = new ArrayList<>();
        players = new ArrayList<>();
    }
    private void setName(String name){
        if(name == null || name.equals(" ") || name.equals("")){
            throw new NullPointerException(FIELD_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
    @Override
    public int sumEnergy() {
        int sum = 0;
        for(Supplement supplement: supplements){
            sum += supplement.getEnergy();
        }
        return sum;
    }

    @Override
    public void addPlayer(Player player) {
        if(players.size() < capacity){
            players.add(player);
        }
        else {
            throw new IllegalStateException("Not enough capacity.");
        }
    }

    @Override
    public void removePlayer(Player player) {
        players.removeIf(p -> p == player);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        supplements.add(supplement);
    }

    @Override
    public void drag() {
        for(Player player: players){
            player.stimulation();
        }
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s (%s):", name, getClass().getSimpleName()));
        sb.append(System.lineSeparator());

        sb.append("Player: ");
        if(players.isEmpty()){
            sb.append("none");
        } else{
            List<String> names = new ArrayList<>();
            for(Player player: players){
                names.add(player.getName());
            }
            sb.append(String.join(" ", names));
        }
        sb.append(System.lineSeparator());
        sb.append(String.format("Supplement: %d", supplements.size()));
        sb.append(System.lineSeparator());
        sb.append("Energy: ").append(sumEnergy());
        return sb.toString();
    }

    @Override
    public Collection<Player> getPlayers() {
        return players;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return supplements;
    }

    @Override
    public String getName() {
        return name;
    }
}
