package christmasPastryShop.entities.booths;

import christmasPastryShop.entities.booths.interfaces.Booth;
import christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.Collection;

import static christmasPastryShop.common.ExceptionMessages.INVALID_NUMBER_OF_PEOPLE;
import static christmasPastryShop.common.ExceptionMessages.INVALID_TABLE_CAPACITY;

public abstract class BaseBooth implements Booth {
    private Collection<Delicacy> delicacyOrders;
    private Collection<Cocktail> cocktailOrders;
    private int boothNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerPerson;
    private boolean isReserved;
    private double price;


    public BaseBooth(int boothNumber, int capacity, double pricePerPerPerson) {
        this.boothNumber = boothNumber;
        setCapacity(capacity);
        this.pricePerPerPerson = pricePerPerPerson;
        delicacyOrders = new ArrayList<>();
        cocktailOrders = new ArrayList<>();
        isReserved = false;
    }

    private void setCapacity(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException(INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }
    private void setNumberOfPeople(int numberOfPeople){
        if(numberOfPeople <= 0){
            throw new IllegalArgumentException(INVALID_NUMBER_OF_PEOPLE);
        }
        this.numberOfPeople = numberOfPeople;
    }
    @Override
    public void reserve(int numberOfPeople) {
        setNumberOfPeople(numberOfPeople);
        this.price = numberOfPeople * pricePerPerPerson;
        isReserved = true;
    }
    @Override
    public double getBill() {
        double sum = 0;
        for(Cocktail cocktail: cocktailOrders){
            sum += cocktail.getPrice();
        }
        for(Delicacy delicacy: delicacyOrders){
            sum += delicacy.getPrice();
        }
        return sum;
    }
    @Override
    public void clear() {
        cocktailOrders.clear();
        delicacyOrders.clear();
        pricePerPerPerson = 0;
        price = 0;
        numberOfPeople = 0;
        isReserved = false;
    }

    @Override
    public int getBoothNumber() {
        return boothNumber;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
