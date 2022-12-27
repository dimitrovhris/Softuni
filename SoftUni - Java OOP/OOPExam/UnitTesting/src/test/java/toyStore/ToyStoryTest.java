package toyStore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ToyStoryTest {
    //TODO: Write your tests here
    private ToyStore toyStore;
    private static final String TOY_MANUFACTURER = "China";
    private static final String TOY_ID = "1";
    private static final String SHELF = "A";
    private Map<String, Toy> toyShelf;
    private Toy toy;


    @Before
    public void setUp() throws OperationNotSupportedException {
        toy = new Toy(TOY_MANUFACTURER, TOY_ID);
        toyStore = new ToyStore();
        toyStore.addToy(SHELF, toy);
    }

    @Test
    public void testAddToyShouldAddAToyIfInputIsValid() throws OperationNotSupportedException {
        Assert.assertEquals("Toy:2 placed successfully!", toyStore.addToy("B", new Toy(TOY_MANUFACTURER, "2")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddToyShouldThrowIfShelfDoesNotExist() throws OperationNotSupportedException {
        toyStore.addToy("H", new Toy(TOY_MANUFACTURER, TOY_ID));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddToyShouldThrowIfShelfIsTaken() throws OperationNotSupportedException {
        toyStore.addToy(SHELF, new Toy(TOY_MANUFACTURER, TOY_ID));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddToyShouldThrowIfItemExists() throws OperationNotSupportedException {
        toyStore.addToy("C", toy);
    }

    @Test
    public void testRemoveToyShouldRemoveToyIfInputIsValid(){
        Assert.assertEquals("Remove toy:1 successfully!", toyStore.removeToy("A", toy));
        Assert.assertNull(toyStore.getToyShelf().get("A"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowIfToyIsNotInTheShelf(){
        toyStore.removeToy("B", toy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowIfShelfDoesNotExist(){
        toyStore.removeToy("Z", toy);
    }

}