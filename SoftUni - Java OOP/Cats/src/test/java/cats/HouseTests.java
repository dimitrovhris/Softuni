package cats;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class HouseTests {
    private static final String HOUSE_NAME = "ShortHouse";
    private static final String CAT_NAME = "Pesho";
    private static final int CAPACITY = 1;
    private House house;
    private Collection<Cat> cats;

    @Before
    public void setUp() {
        house = new House(HOUSE_NAME, CAPACITY);
        cats = new ArrayList<>();
    }

    @Test
    public void testSetNameShouldSetNameSuccessfullyIfInputIsValid() {
        new House(HOUSE_NAME, CAPACITY);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldThrowIfNameIsNull() {
        new House(null, CAPACITY);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldThrowIfNameIsEmpty() {
        new House("   ", CAPACITY);
    }

    @Test
    public void testSetCapacityShouldSetCapacitySuccessfullyIfInputIsValid() {
        new House(HOUSE_NAME, CAPACITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityShouldThrowIfCapacityIsBelowZero() {
        new House(HOUSE_NAME, -1);
    }

    @Test
    public void testAddCatShouldAddACatIfThereIsCapacity() {
        house.addCat(new Cat(CAT_NAME));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCatShouldThrowIfThereIsNoCapacity() {
        house.addCat(new Cat(CAT_NAME));
        house.addCat(new Cat(CAT_NAME));
    }

    @Test
    public void testCatToRemoveShouldRemoveSuccessfullyIfNameIsValid() {
        house.addCat(new Cat(CAT_NAME));
        Assert.assertEquals(1, house.getCount());
        house.removeCat(CAT_NAME);
        Assert.assertEquals(0, house.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCatToRemoveShouldThrowIfNameIsNotValid() {
        house.addCat(new Cat(CAT_NAME));
        house.removeCat("Tosho");
    }

    @Test
    public void testCatForSaleShouldSetHungryToFalseIfNameIsValid() {
        Cat cat = new Cat(CAT_NAME);
        house.addCat(cat);
        house.catForSale(CAT_NAME);
        Assert.assertFalse(cat.isHungry());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCatForSaleShouldThrowIfNameIsNotValid() {
        house.addCat(new Cat(CAT_NAME));
        house.catForSale("Tosho");
    }


}
