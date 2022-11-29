package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private static final Integer[] NUMBERS = {1, 3, 5, 6};
    private Database database;
    @Before
    public void setUp() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }
    @Test
    public void testConstructorShouldCreateValidDB() throws OperationNotSupportedException {
        Integer[] dbElements = database.getElements();
        Assert.assertArrayEquals(NUMBERS, dbElements);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowWithMoreThan16Elements() throws OperationNotSupportedException {
        Integer[] bigArray = new Integer[19];
        new Database(bigArray);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowWith0Elements() throws OperationNotSupportedException {
        Integer[] emptyArray = new Integer[0];
        new Database(emptyArray);
    }
    @Test
    public void testAddShouldAddSuccessfully() throws OperationNotSupportedException {
        database.add(11);
        Integer[] dbElements = database.getElements();
        Assert.assertEquals(NUMBERS.length + 1, dbElements.length);
        Assert.assertEquals(Integer.valueOf(11), dbElements[dbElements.length-1]);

    }
    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullShouldThrow() throws OperationNotSupportedException{
        database.add(null);
    }
    @Test
    public void testRemoveShouldRemoveSuccessfully() throws OperationNotSupportedException{
        Integer[] elementsBeforeRemove = database.getElements();
        database.remove();
        Integer[] elementsAfterRemove = database.getElements();
        Assert.assertEquals(elementsBeforeRemove.length - 1, elementsAfterRemove.length);
        Assert.assertEquals(elementsBeforeRemove[elementsBeforeRemove.length-2],
                elementsAfterRemove[elementsAfterRemove.length-1]);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowWithEmptyDB() throws OperationNotSupportedException {
        int length = database.getElements().length;
        for(int i = 0; i < length; i++){
            database.remove();
        }
        database.remove();
    }

}