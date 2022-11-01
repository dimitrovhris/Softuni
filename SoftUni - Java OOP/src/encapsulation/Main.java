package encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            double salary = Double.parseDouble(data[3]);
            try {
                people.add(new Person(firstName, lastName, age, salary));
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        double percent = Double.parseDouble(reader.readLine());

        for (Person person : people) {
            person.increaseSalary(percent);
            System.out.println(person.toString());
        }
    }
}
