package setsAndMaps;

import java.util.*;

public class Ex07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, Set<String>>> destinations = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];
            if (!destinations.containsKey(continent)) {
                destinations.put(continent, new LinkedHashMap<>());
            }
            destinations.get(continent).putIfAbsent(country, new LinkedHashSet<>());
            destinations.get(continent).get(country).add(city);
        }
        for (Map.Entry<String, Map<String, Set<String>>> entry : destinations.entrySet()) {
            System.out.printf("%s:%n", entry.getKey());
            for (Map.Entry<String, Set<String>> setEntry : entry.getValue().entrySet()) {
                System.out.printf("  %s -> %s%n", setEntry.getKey(), String.join(", ", setEntry.getValue()));
            }
        }
    }
}

