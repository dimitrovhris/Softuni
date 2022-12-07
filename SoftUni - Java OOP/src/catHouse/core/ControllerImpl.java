package catHouse.core;

import catHouse.common.ConstantMessages;
import catHouse.common.ExceptionMessages;
import catHouse.entities.cat.Cat;
import catHouse.entities.cat.LonghairCat;
import catHouse.entities.cat.ShorthairCat;
import catHouse.entities.houses.House;
import catHouse.entities.houses.LongHouse;
import catHouse.entities.houses.ShortHouse;
import catHouse.entities.toys.Ball;
import catHouse.entities.toys.Mouse;
import catHouse.entities.toys.Toy;
import catHouse.repositories.ToyRepository;

import java.util.ArrayList;
import java.util.Collection;

import static catHouse.common.ConstantMessages.*;
import static catHouse.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private ToyRepository toys;
    private Collection<House> houses;

    public ControllerImpl() {
        toys = new ToyRepository();
        houses = new ArrayList<>();
    }

    @Override
    public String addHouse(String type, String name) {
        if (type.equals("ShortHouse")) {
            houses.add(new ShortHouse(name));
        } else if (type.equals("LongHouse")) {
            houses.add(new LongHouse(name));
        } else {
            throw new NullPointerException(INVALID_HOUSE_TYPE);
        }
        return String.format(SUCCESSFULLY_ADDED_HOUSE_TYPE, type);
    }

    @Override
    public String buyToy(String type) {
        if (type.equals("Ball")) {
            toys.buyToy(new Ball());
        } else if (type.equals("Mouse")) {
            toys.buyToy(new Mouse());
        } else {
            throw new IllegalArgumentException(INVALID_TOY_TYPE);
        }
        return String.format(SUCCESSFULLY_ADDED_TOY_TYPE, type);
    }

    @Override
    public String toyForHouse(String houseName, String toyType) {
        House house = findHouseByName(houseName);
        Toy toy = toys.findFirst(toyType);
        if(toy == null){
            throw new IllegalArgumentException(String.format(NO_TOY_FOUND, toyType));
        }
        house.buyToy(toy);
        toys.removeToy(toy);
        return String.format(SUCCESSFULLY_ADDED_TOY_IN_HOUSE, toyType, houseName);
    }

    @Override
    public String addCat(String houseName, String catType, String catName, String catBreed, double price) {
        House house = findHouseByName(houseName);
        Cat cat;
        if(catType.equals("LonghairCat")){
            cat = new LonghairCat(catName, catBreed, price);
        } else if(catType.equals("ShorthairCat")){
            cat = new ShorthairCat(catName, catBreed, price);
        } else{
            throw new IllegalArgumentException(INVALID_CAT_TYPE);
        }
        return checkCatSuitability(catType, house, cat);
    }

    @Override
    public String feedingCat(String houseName) {
        House house = findHouseByName(houseName);
        house.feeding();
        return String.format(FEEDING_CAT, house.getCats().size());
    }

    @Override
    public String sumOfAll(String houseName) {
        double totalSum = 0;
        House house = findHouseByName(houseName);
        for(Toy toy: house.getToys()){
            totalSum += toy.getPrice();
        }
        for(Cat cat: house.getCats()){
            totalSum += cat.getPrice();
        }
        return String.format(VALUE_HOUSE, houseName, totalSum);
    }

    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        for(House house: houses){
            sb.append(house.getStatistics());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private House findHouseByName(String houseName) {
        for (House house : houses) {
            if (house.getName().equals(houseName)) {
                return house;
            }
        }
        return null;
    }
    private String checkCatSuitability(String catType, House house, Cat cat){

        if(catType.equals("LonghairCat")){
            if(house instanceof LongHouse){
                house.addCat(cat);
                return String.format(SUCCESSFULLY_ADDED_CAT_IN_HOUSE, catType, "LongHouse");
            } else{
                return "Unsuitable house.";
            }
        } else{
            if(house instanceof ShortHouse){
                house.addCat(cat);
                return String.format(SUCCESSFULLY_ADDED_CAT_IN_HOUSE, catType, "ShortHouse");
            } else{
                return "Unsuitable house.";
            }
        }
    }
}
