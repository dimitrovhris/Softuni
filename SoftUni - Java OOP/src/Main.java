import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] people = reader.readLine().split(";");
        String[] products = reader.readLine().split(";");
        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productList = new LinkedHashMap<>();
        for (String person : people) {
            String[] personData = person.split("=");
            try {
                Person newPerson = new Person(personData[0], Double.parseDouble(personData[1]));
                personMap.put(personData[0], newPerson);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        for (String product : products) {
            String[] productData = product.split("=");
            try {
                Product newProduct = new Product(productData[0], Double.parseDouble(productData[1]));
                productList.put(newProduct.getName(), newProduct);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        String input = reader.readLine();
        while (!input.equals("END")) {
            String[] purchaseData = input.split(" ");
            Person person = personMap.get(purchaseData[0]);
            Product product = productList.get(purchaseData[1]);
            try {
                if (person != null) {
                    person.buyProduct(product);
                    System.out.println(purchaseData[0] + " bought " + purchaseData[1]);
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break;
            }
            input = reader.readLine();
        }
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            if (entry.getValue().getProducts().isEmpty()) {
                System.out.printf("%s - Nothing bought%n", entry.getKey());
            } else {
                System.out.print(entry.getKey() + " - ");
                List<String> list = new ArrayList<>();
                for (Product product : entry.getValue().getProducts()) {
                    list.add(product.getName());
                }
                System.out.print(String.join(", ", list));
                System.out.println();
            }
        }
    }
}

