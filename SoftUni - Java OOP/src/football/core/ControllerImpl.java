package football.core;


import football.common.ExceptionMessages;
import football.entities.field.ArtificialTurf;
import football.entities.field.Field;
import football.entities.field.NaturalGrass;
import football.entities.player.Men;
import football.entities.player.Player;
import football.entities.player.Women;
import football.entities.supplement.Liquid;
import football.entities.supplement.Powdered;
import football.entities.supplement.Supplement;
import football.repositories.SupplementRepository;
import football.repositories.SupplementRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

import static football.common.ConstantMessages.*;
import static football.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private SupplementRepository supplement;
    private Collection<Field> fields;
    public ControllerImpl() {
        this.supplement = new SupplementRepositoryImpl();
        this.fields = new ArrayList<>();
    }

    @Override
    public String addField(String fieldType, String fieldName) {
            Field field;
            switch (fieldType){
                case "ArtificialTurf":
                    field = new ArtificialTurf(fieldName);
                    break;
                case "NaturalGrass":
                    field = new NaturalGrass(fieldName);
                    break;
                default:
                    throw new NullPointerException(INVALID_FIELD_TYPE);
            }
            fields.add(field);
            return String.format("Successfully added %s", fieldType);
        }

    @Override
    public String deliverySupplement(String type) {
        Supplement supplement1;
        switch(type){
            case "Powdered":
                supplement1 = new Powdered();
                break;
            case "Liquid":
                supplement1 = new Liquid();
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_SUPPLEMENT_TYPE);
        }
        supplement.add(supplement1);
        return String.format("Successfully added %s.", type);

    }

    @Override
    public String supplementForField(String fieldName, String supplementType) {
        Supplement supplement1 = supplement.findByType(supplementType);
        Field field = getFieldByName(fieldName);
        if(supplement1 == null){
            throw new IllegalArgumentException(String.format(NO_SUPPLEMENT_FOUND, supplementType));
        } else{
            field.addSupplement(supplement1);
        }
        supplement.remove(supplement1);
        return String.format("Successfully added %s to %s.", supplementType, fieldName);
    }

    @Override
    public String addPlayer(String fieldName, String playerType, String playerName, String nationality, int strength) {

        Field field = getFieldByName(fieldName);
        Player player;
        switch (playerType){
            case "Men":
                player = new Men(playerName, nationality, strength);
                break;
            case "Women":
                player = new Women(playerName, nationality, strength);
                break;
            default:
                throw new IllegalArgumentException(INVALID_PLAYER_TYPE);
        }
        if(playerIsSuitable(playerType, field)){
            field.addPlayer(player);
            return String.format(SUCCESSFULLY_ADDED_PLAYER_IN_FIELD, playerType, fieldName);
        }
        field.addPlayer(player);
        return "The pavement of the terrain is not suitable.";
    }

    @Override
    public String dragPlayer(String fieldName) {
        Field field = getFieldByName(fieldName);
        for(Player player: field.getPlayers()){
            player.stimulation();
        }
        return String.format(PLAYER_DRAG, field.getPlayers().size());
    }

    @Override
    public String calculateStrength(String fieldName) {
        Field field = getFieldByName(fieldName);
        int sum = 0;
        for(Player player: field.getPlayers()){
            sum += player.getStrength();
        }
        return String.format(STRENGTH_FIELD, fieldName, sum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        for(Field field: fields){
            sb.append(field.getInfo());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    private Field getFieldByName(String name){
        return fields.stream()
                .filter(f -> f.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    private boolean playerIsSuitable(String playerType, Field field){
        if(playerType.equals("Men")){
            return field instanceof NaturalGrass;

        } else {
            return field instanceof ArtificialTurf;
        }
    }
}
