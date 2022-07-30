package finalExamPreparation05;

import java.util.*;

public class Ex03Pirates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, List<Integer>> cities = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String[] splitInput = input.split("\\|\\|");
            String city = splitInput[0];
            int population = Integer.parseInt(splitInput[1]);
            int gold = Integer.parseInt(splitInput[2]);
            if (!cities.containsKey(city)) {
                cities.put(city, new ArrayList<>());
                cities.get(city).add(population);
                cities.get(city).add(gold);
            } else {
                cities.get(city).set(0, cities.get(city).get(0) + population);
                cities.get(city).set(1, cities.get(city).get(1) + gold);
            }
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while (!input.equals("End")) {
            String[] splitInput = input.split("=>");
            String command = splitInput[0];
            String town = splitInput[1];
            int currentPeople = cities.get(town).get(0);
            int currentGold = cities.get(town).get(1);
            switch (command) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(splitInput[2]);
                    int goldPlundered = Integer.parseInt(splitInput[3]);
                    cities.get(town).set(0, currentPeople - peopleKilled);
                    cities.get(town).set(1, currentGold - goldPlundered);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, goldPlundered, peopleKilled);
                    if (cities.get(town).contains(0)) {
                        cities.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int goldAdded = Integer.parseInt(splitInput[2]);
                    if (goldAdded >= 0) {
                        cities.get(town).set(1, currentGold + goldAdded);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                goldAdded, town, cities.get(town).get(1));
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
            }
            input = sc.nextLine();
        }
        if (!cities.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());
            for (Map.Entry<String, List<Integer>> entry : cities.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
            }
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
