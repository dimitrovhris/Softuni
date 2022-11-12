package interfacesAndAbstraction.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Citizen> citizens = new ArrayList<>();
        List<Robot> robots = new ArrayList<>();
        while(!input.equals("End")){
            String[] data = input.split(" ");
            if(data.length == 3){
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];
                citizens.add(new Citizen(name, age, id));
            } else{
                String model = data[0];
                String id = data[1];
                robots.add(new Robot(id, model));
            }
            input = sc.nextLine();
        }
        String validator = sc.nextLine();
        citizens.stream()
                .filter(e-> e.getId().endsWith(validator))
                .forEach(e-> System.out.println(e.getId()));
        robots.stream()
                .filter(e-> e.getId().endsWith(validator))
                .forEach(e -> System.out.println(e.getId()));
    }
}

