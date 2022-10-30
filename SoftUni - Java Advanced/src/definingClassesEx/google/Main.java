package definingClassesEx.google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Person> people = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            people.putIfAbsent(data[0], new Person(data[0]));
            switch (data[1]) {
                case "company":
                    Company company = new Company(data[2], data[3], Double.parseDouble(data[4]));
                    people.get(data[0]).setCompany(company);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(data[2], data[3]);
                    people.get(data[0]).getPokemons().add(pokemon);
                    break;
                case "parents":
                    Parent parent = new Parent(data[2], data[3]);
                    people.get(data[0]).getParents().add(parent);
                    break;
                case "children":
                    Child child = new Child(data[2], data[3]);
                    people.get(data[0]).getChildren().add(child);
                    break;
                case "car":
                    Car car = new Car(data[2], Integer.parseInt(data[3]));
                    people.get(data[0]).setCar(car);
                    break;
            }
            input = sc.nextLine();
        }
        String name = sc.nextLine();
        Person currentPerson = people.get(name);
        System.out.println(name);
        System.out.println("Company:");
        if(currentPerson.getCompany() != null)
            System.out.printf(currentPerson.getCompany().getName() + " " + currentPerson.getCompany().getDepartment() +
                    " " + "%.2f%n", currentPerson.getCompany().getSalary());
        System.out.println("Car:");
        if(currentPerson.getCar() != null)
            System.out.println(currentPerson.getCar().getModel() + " " + currentPerson.getCar().getSpeed());
        System.out.println("Pokemon:");
        currentPerson.getPokemons()
                .forEach(e -> System.out.println("" + e.getPokemonName() + " " + e.getPokemonType()));
        System.out.println("Parents:");
        currentPerson.getParents()
                .forEach(e -> System.out.println("" + e.getName() + " " + e.getBirthday()));
        System.out.println("Children:");
        currentPerson.getChildren()
                .forEach(e -> System.out.println("" + e.getName() + " " + e.getBirthday()));
    }

}

