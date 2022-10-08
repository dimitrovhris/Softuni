package definingClassesEx.pokemonTrainer;

import java.util.ArrayList;

public class Trainer {
    private String name;
    private int badges;
    private ArrayList<Pokemon> pokemons;

    Trainer(String name){
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public void addOneBadge(){
        this.setBadges(this.getBadges() + 1);
    }
}
