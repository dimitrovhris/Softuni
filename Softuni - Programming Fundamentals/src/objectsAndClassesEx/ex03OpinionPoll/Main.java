package objectsAndClassesEx.ex03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> peopleOver30 = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] input = sc.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            if(age > 30){
                peopleOver30.add(person);
            }
        }
        for(Person item: peopleOver30){
            System.out.println(item);
        }
    }
}
