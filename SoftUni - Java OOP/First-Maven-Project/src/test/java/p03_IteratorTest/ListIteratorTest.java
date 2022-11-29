package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {
    ListIterator listIterator;
    @Before
    public void setUp() throws OperationNotSupportedException {
        String apple = "Apple";
        String banana = "Banana";
        String tomato = "Tomato";
        listIterator = new ListIterator(apple, banana, tomato);
    }
    @Test
    public void testConstructorShouldCreateValidListIterator() throws OperationNotSupportedException {
        ListIterator listIterator1 = new ListIterator("Hi", "Hello");
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowIfNullIsGiven() throws OperationNotSupportedException{
        ListIterator listIterator1 = new ListIterator(null);
    }
    @Test
    public void testMove() throws OperationNotSupportedException{
        assertTrue(listIterator.move());
        assertTrue(listIterator.move());
        assertFalse(listIterator.move());
    }
    @Test
    public void testHasNext(){
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertTrue(listIterator.hasNext());
        listIterator.move();
        assertFalse(listIterator.hasNext());
    }
    @Test
    public void testPrintShouldPrintTheElementAtTheCurrentIndex(){
        assertEquals("Apple", listIterator.print());
    }
    @Test(expected = IllegalStateException.class)
    public void testPrintShouldThrowIfListIsEmpty() throws IllegalArgumentException, OperationNotSupportedException {
        ListIterator listIterator1 = new ListIterator();
        listIterator1.print();
    }

}