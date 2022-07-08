package associativeArraysEx;

import java.util.*;

public class Ex03LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> materials = new LinkedHashMap<>();
        int totalShards = 0;
        int totalFragments = 0;
        int totalMotes = 0;
        boolean end = false;
        while(!end) {
            String[] input = sc.nextLine().toLowerCase().split(" ");
            for (int i = 0; i <= input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1];
                switch (material) {
                    case "shards":
                        totalShards += quantity;
                        break;
                    case "fragments":
                        totalFragments += quantity;
                        break;
                    case "motes":
                        totalMotes += quantity;
                        break;
                }
                if (!materials.containsKey(material)) {
                    materials.put(material, quantity);
                } else {
                    materials.put(material, materials.get(material) + quantity);
                }
                if (totalShards >= 250) {
                    totalShards -= 250;
                    System.out.println("Shadowmourne obtained!");
                    end = true;
                    break;
                } else if (totalFragments >= 250) {
                    totalFragments -= 250;
                    System.out.println("Valanyr obtained!");
                    end = true;
                    break;
                } else if (totalMotes >= 250) {
                    totalMotes -= 250;
                    System.out.println("Dragonwrath obtained!");
                    end = true;
                    break;
                }
            }
        }
        System.out.printf("shards: %d%n", totalShards);
        System.out.printf("fragments: %d%n", totalFragments);
        System.out.printf("motes: %d%n", totalMotes);
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            if(!entry.getKey().equals("shards") && !entry.getKey().equals("fragments") && !entry.getKey().equals("motes")){
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }

    }
}
