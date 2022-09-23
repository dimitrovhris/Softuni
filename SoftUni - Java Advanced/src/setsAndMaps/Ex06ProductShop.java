package setsAndMaps;

import java.util.*;

public class Ex06ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        while(!input.equals("Revision")){
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            String price = data[2];
            if(!shops.containsKey(shop)){
                shops.put(shop, new LinkedHashMap<>());
            }
            shops.get(shop).put(product, Double.parseDouble(price));
            input = sc.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (Map.Entry<String, Double> doubleEntry : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", doubleEntry.getKey(), doubleEntry.getValue());
            }
        }

    }
}
