package associativeArraysEx;

import java.util.*;

public class Ex04Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap <String, List<Double>> products = new LinkedHashMap<>();
        while(!input.equals("buy")){
            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Integer.parseInt(input.split(" ")[2]);
            if(!products.containsKey(productName)){
                products.put(productName, new ArrayList<>());
                products.get(productName).add(price);
                products.get(productName).add(quantity);
            }
            else{
                products.get(productName).set(0, price);
                products.get(productName).set(1, products.get(productName).get(1) + quantity);
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }

    }
}
