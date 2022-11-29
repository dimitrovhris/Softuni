package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;

    @Before
    public void setUp() throws OperationNotSupportedException {
        Person pesho = new Person(1, "Pesho");
        Person gosho = new Person(2, "Gosho");
        Person tosho = new Person(3, "Tosho");
        database = new Database(pesho, gosho, tosho);
    }
    @Test
    public void testAddShouldAddValidPerson() throws OperationNotSupportedException {
        Person person = new Person(4, "Maria");
        database.add(person);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowIfPersonAlreadyExists() throws OperationNotSupportedException {
        Person newPerson = new Person(2, "Maria");
        database.add(null);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testAddShouldThrowIfNullIsGiven() throws OperationNotSupportedException{
        database.add(null);
    }
    @Test
    public void testRemoveShouldRemoveAPersonSuccessfully() throws OperationNotSupportedException {
        Person[] peopleBeforeRemove = database.getElements();
        database.remove();
        Person[] peopleAfterRemove = database.getElements();
        Assert.assertEquals(peopleBeforeRemove.length-1, peopleAfterRemove.length);
        Assert.assertEquals(peopleBeforeRemove[peopleBeforeRemove.length-2],
                peopleAfterRemove[peopleAfterRemove.length-1]);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldThrowIfIndexIsOutOfBounds() throws OperationNotSupportedException {
        int length = database.getElements().length;
        for(int i = 1; i <= length; i++){
            database.remove();
        }
        database.remove();
    }
    @Test
    public void testFindByUsernameShouldFindAPersonByUsername() throws OperationNotSupportedException {
        Person foundPerson = database.findByUsername("Pesho");
        Assert.assertEquals(database.getElements()[0], foundPerson);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowIfNullIsGiven() throws OperationNotSupportedException{
        Person foundPerson = database.findByUsername(null);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowIfInputUsernameDoesNotExist() throws OperationNotSupportedException{
        Person foundPerson = database.findByUsername("Maria");
    }
    @Test
    public void testFindByIdShouldFindAPersonById() throws OperationNotSupportedException{
        Person foundPerson = database.findById(1);
        Assert.assertEquals(database.getElements()[0], foundPerson);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdShouldThrowIfInputIdDoesNotExist() throws OperationNotSupportedException{
        Person foundPerson = database.findById(4);
    }



}