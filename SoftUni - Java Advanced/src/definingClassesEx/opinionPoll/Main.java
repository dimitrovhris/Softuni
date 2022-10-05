package definingClassesEx.opinionPoll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> list = new ArrayList<>();
        while(n-- > 0){
            String[] data = sc.nextLine().split(" ");
            Person person = new Person(data[0],  Integer.parseInt(data[1]));
            list.add(person);
        }
        Predicate<Person> ageFilter = p -> p.getAge() > 30;
        Consumer<Person> printer = p -> System.out.println(p.getName() + " - " + p.getAge());

        list.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(ageFilter)
                .forEach(printer);
    }
}
