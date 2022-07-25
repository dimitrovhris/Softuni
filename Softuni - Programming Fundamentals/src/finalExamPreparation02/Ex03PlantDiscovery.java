package finalExamPreparation02;

import java.util.*;

public class Ex03PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> plants = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String plant = input.split("<->")[0];
            double rarity = Double.parseDouble(input.split("<->")[1]);
            plants.put(plant, new ArrayList<>());
            plants.get(plant).add(rarity);
        }
        String input = sc.nextLine();
        while (!input.equals("Exhibition")) {
            String command = input.split(": ")[0];
            switch (command) {
                case "Rate":
                    String plant = input.split(": ")[1].split(" - ")[0];
                    if (plants.containsKey(plant)) {
                        double newRating = Double.parseDouble(input.split(": ")[1].split(" - ")[1]);
                        plants.get(plant).add(newRating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String plantToUpdate = input.split(": ")[1].split(" - ")[0];
                    if (plants.containsKey(plantToUpdate)) {
                        double newRarity = Double.parseDouble(input.split(": ")[1].split(" - ")[1]);
                        plants.get(plantToUpdate).set(0, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String plantToReset = input.split(": ")[1];
                    if (plants.containsKey(plantToReset)) {
                        double rarity = plants.get(plantToReset).get(0);
                        plants.get(plantToReset).clear();
                        plants.get(plantToReset).add(rarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, List<Double>> entry : plants.entrySet()) {
            double sumOfRatings = 0;
            double averageRating = 0;
            if (entry.getValue().size() > 1) {
                for (int i = 1; i <= entry.getValue().size() - 1; i++) {
                    sumOfRatings += entry.getValue().get(i);
                }
                averageRating = sumOfRatings / (entry.getValue().size() - 1);
            }
            else{
                averageRating = 0;
            }

            System.out.printf(" - %s; Rarity: %.0f; Rating: %.2f%n", entry.getKey(), entry.getValue().get(0), averageRating);
        }
    }
}