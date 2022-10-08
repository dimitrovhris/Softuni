package definingClassesEx.google;

import java.util.ArrayList;

public class Person {
    private String name;
    private Car car;
    private Company company;
    private ArrayList<Parent> parents;
    private ArrayList<Child> children;
    private ArrayList<Pokemon> pokemons;

    public Person(String name, Car acr, Company company, ArrayList<Parent> parents, ArrayList<Child> children, ArrayList<Pokemon> pokemons) {
        this.name = name;
        this.car = acr;
        this.company = company;

    }
    public Person (String name){
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<Parent> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Parent> parents) {
        this.parents = parents;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
