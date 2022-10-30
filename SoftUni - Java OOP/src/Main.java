import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] data = reader.readLine().split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            people.add(new Person(firstName, lastName, age));
        }
        people.sort((p1, p2) -> {
            int nameComparator = p1.getFirstName().compareTo(p2.getFirstName());
            if (nameComparator != 0) {
                return nameComparator;
            } else {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        for(Person person: people){
            System.out.println(person.toString());
        }
    }
}
