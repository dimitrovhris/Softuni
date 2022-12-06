package football.entities.player;

import football.common.ExceptionMessages;

import static football.common.ExceptionMessages.*;

public abstract class BasePlayer implements Player{
    private String name;
    private String nationality;
    private double kg;
    protected int strength;

    public BasePlayer(String name, String nationality, double kg, int strength) {
        setName(name);
        this.kg = kg;
        setNationality(nationality);
        setStrength(strength);
    }

    @Override
    public void setName(String name) {
        if(name == null || name.equals("") || name.equals(" ")){
            throw new NullPointerException(PLAYER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public double getKg() {
        return kg;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }
    private void setNationality(String nationality){
        if(nationality == null || nationality.equals("") || nationality.equals(" ")){
            throw new NullPointerException(PLAYER_NATIONALITY_NULL_OR_EMPTY);
        }
        this.nationality = nationality;
    }
    private void setStrength(int strength){
        if(strength <= 0){
            throw new IllegalArgumentException(PLAYER_STRENGTH_BELOW_OR_EQUAL_ZERO);
        }
        this.strength = strength;
    }
}
