package christmasPastryShop.core;

import christmasPastryShop.common.ExceptionMessages;
import christmasPastryShop.common.OutputMessages;
import christmasPastryShop.core.interfaces.Controller;
import christmasPastryShop.entities.booths.OpenBooth;
import christmasPastryShop.entities.booths.PrivateBooth;
import christmasPastryShop.entities.cocktails.Hibernation;
import christmasPastryShop.entities.cocktails.MulledWine;
import christmasPastryShop.entities.delicacies.Gingerbread;
import christmasPastryShop.entities.delicacies.Stolen;
import christmasPastryShop.entities.delicacies.interfaces.Delicacy;
import christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import christmasPastryShop.entities.booths.interfaces.Booth;
import christmasPastryShop.repositories.interfaces.BoothRepository;
import christmasPastryShop.repositories.interfaces.CocktailRepository;
import christmasPastryShop.repositories.interfaces.DelicacyRepository;

import static christmasPastryShop.common.ExceptionMessages.BOOTH_EXIST;
import static christmasPastryShop.common.ExceptionMessages.FOOD_OR_DRINK_EXIST;
import static christmasPastryShop.common.OutputMessages.*;

public class ControllerImpl implements Controller {
    private DelicacyRepository<Delicacy> delicacyRepository;
    private CocktailRepository<Cocktail> cocktailRepository;
    private BoothRepository<Booth> boothRepository;
    private double totalIncome = 0;

    public ControllerImpl(DelicacyRepository<Delicacy> delicacyRepository, CocktailRepository<Cocktail> cocktailRepository, BoothRepository<Booth> boothRepository) {
        this.delicacyRepository = delicacyRepository;
        this.cocktailRepository = cocktailRepository;
        this.boothRepository = boothRepository;
    }

    @Override
    public String addDelicacy(String type, String name, double price) {

        // TODO
        if (delicacyRepository.getByName(name) == null) {
            if (type.equals("Gingerbread")) {
                delicacyRepository.add(new Gingerbread(name, price));
            } else if (type.equals("Stolen")) {
                delicacyRepository.add(new Stolen(name, price));
            }
            return String.format(DELICACY_ADDED, name, type);
        } else {
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }
    }

    @Override
    public String addCocktail(String type, String name, int size, String brand) {
        //TODO
        if (cocktailRepository.getByName(name) == null) {
            switch (type) {
                case "Hibernation":
                    cocktailRepository.add(new Hibernation(name, size, brand));
                    break;
                case "MulledWine":
                    cocktailRepository.add(new MulledWine(name, size, brand));
                    break;
            }
            return String.format(COCKTAIL_ADDED, name, brand);
        } else {
            throw new IllegalArgumentException(String.format(FOOD_OR_DRINK_EXIST, type, name));
        }
    }

    @Override
    public String addBooth(String type, int boothNumber, int capacity) {
        //TODO
        if (boothRepository.getByNumber(boothNumber) == null) {
            switch (type) {
                case "OpenBooth":
                    boothRepository.add(new OpenBooth(boothNumber, capacity));
                    break;
                case "PrivateBooth":
                    boothRepository.add(new PrivateBooth(boothNumber, capacity));
                    break;
            }
            return String.format(BOOTH_ADDED, boothNumber);
        } else {
            throw new IllegalArgumentException(String.format(BOOTH_EXIST, boothNumber));
        }
    }

    @Override
    public String reserveBooth(int numberOfPeople) {
        //TODO
        for (Booth booth : boothRepository.getAll()) {
            if (!booth.isReserved() && booth.getCapacity() >= numberOfPeople) {
                booth.reserve(numberOfPeople);
                return String.format(BOOTH_RESERVED, booth.getBoothNumber(), numberOfPeople);
            }
        }
        return String.format(RESERVATION_NOT_POSSIBLE, numberOfPeople);
    }

    @Override
    public String leaveBooth(int boothNumber) {
        //TODO

        for (Booth booth : boothRepository.getAll()) {
            if (booth.getBoothNumber() == boothNumber) {
                double totalSum = booth.getPrice() + booth.getBill();
                totalIncome += totalSum;
                booth.clear();
                return String.format(BILL, boothNumber, totalSum);
            }
        }
        return null;

    }

    @Override
    public String getIncome() {
        //TODO
        return String.format(TOTAL_INCOME, totalIncome);
    }
}
