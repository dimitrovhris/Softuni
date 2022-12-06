package football;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FootballTeamTests {
    private static final int VACANT_POSITIONS = 12;
    private static final String FOOTBALL_TEAM_NAME = "Beroe";
    private static final String PLAYER_NAME = "Pesho";
    private Footballer footballer;
    private FootballTeam footballTeam;


    @Before
    public void setUp() {
        this.footballer = new Footballer(PLAYER_NAME);
        this.footballTeam = new FootballTeam(FOOTBALL_TEAM_NAME, VACANT_POSITIONS);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldThrowIfNameIsNull() {
        new FootballTeam(null, VACANT_POSITIONS);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldThrowIfNameIsEmpty() {
        new FootballTeam("   ", VACANT_POSITIONS);
    }

    @Test
    public void testSetNameShouldCreateValidTeamIfNameIsValid() {
        new FootballTeam("Beroe", VACANT_POSITIONS);
    }

    @Test
    public void testGetNameShouldReturnName() {
        Assert.assertEquals("Beroe", footballTeam.getName());
    }

    @Test
    public void testGetVacantPositionsShouldReturnVacantPositions() {
        Assert.assertEquals(12, footballTeam.getVacantPositions());
    }

    @Test
    public void testSetVacantPositionsShouldCreateValidFootballTeamIfInputIsValid() {
        new FootballTeam(FOOTBALL_TEAM_NAME, 15);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetVacantPositionsShouldThrowIfInputIsBelow0() {
        new FootballTeam(FOOTBALL_TEAM_NAME, -1);
    }

    @Test
    public void testGetCountShouldReturnFootballersCount() {
        Assert.assertEquals(0, footballTeam.getCount());
    }

    @Test
    public void testAddFootballerShouldAddIfInputIsValid() {
        footballTeam.addFootballer(footballer);
        Assert.assertEquals(1, footballTeam.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddFootballerShouldThrowIfTeamIsFull(){
        FootballTeam team = new FootballTeam(FOOTBALL_TEAM_NAME, 0);
        team.addFootballer(new Footballer(PLAYER_NAME));
    }
    @Test
    public void testRemoveFootballerShouldRemoveSuccessfully(){
        footballTeam.addFootballer(new Footballer(PLAYER_NAME));
        Assert.assertEquals(1, footballTeam.getCount());
        footballTeam.removeFootballer(PLAYER_NAME);
        Assert.assertEquals(0, footballTeam.getCount());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowIfPlayerIsNull(){
        footballTeam.removeFootballer(null);
    }
    @Test
    public void testFootballerForSaleShouldReturnFootballerIfInputIsValid(){
        footballTeam.addFootballer(footballer);
        footballTeam.footballerForSale(footballer.getName());
        Assert.assertFalse(footballer.isActive());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testFootballerForSaleShouldThrowIfInputIsNull(){
        footballTeam.footballerForSale(null);
    }


}