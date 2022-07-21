package regularExpressionsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> boughtFurniture = new ArrayList<>();
        Pattern pattern = Pattern.compile(">>(?<item>\\w+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>\\d+)\\b");
        double totalSum = 0;
        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                String item = matcher.group("item");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                boughtFurniture.add(item);
                totalSum += price * quantity;
            }
            input = sc.nextLine();
        }
        System.out.println("Bought furniture:");
        for(String item: boughtFurniture){
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
