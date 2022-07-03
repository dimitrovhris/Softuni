package objectsAndClassesEx.ex07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Person> people = new ArrayList<>();
        while(!input.equals("End")){
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = sc.nextLine();
        }
        people.sort(Comparator.comparingInt(Person::getAge));
        for(Person item: people){
            System.out.println(item);
        }
    }
}
