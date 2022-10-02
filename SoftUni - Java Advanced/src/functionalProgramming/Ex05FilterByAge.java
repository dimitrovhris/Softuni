package functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex05FilterByAge {
    static class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Function<Scanner, Person> addPerson = scanner -> {
            String[] data = scanner.nextLine().split(", ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            return new Person(name, age);
        };
        List<Person> people = new ArrayList<>();
        for(int i = 0; i < n; i++){
            people.add(addPerson.apply(sc));
        }
        String condition = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String filter = sc.nextLine();

        Predicate<Person> ageFilter = getFilter(condition, age);
        Consumer<Person> printer = getPrinter(filter);
        people.stream()
                .filter(ageFilter)
                .forEach(printer);
    }
    public static Predicate<Person> getFilter (String condition, int age){
        switch(condition){
            case "younger":
                return p -> p.age <= age;
            default:
                return p -> p.age >= age;
        }
    }
    public static Consumer<Person> getPrinter(String format){
        switch(format){
            case "name":
                return p -> System.out.println(p.name);
            case "age":
                return p -> System.out.println(p.age);
            default:
                return p -> System.out.println(p.name + " - " + p.age);
        }
    }
}
