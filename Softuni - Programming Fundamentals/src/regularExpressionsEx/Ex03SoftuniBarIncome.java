package regularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03SoftuniBarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("^%(?<customer>[A-Z][a-z]+)%[^|$.%]*<(?<product>\\w+)>[^|$.%]*\\|" +
                "(?<count>[0-9]+)\\|[^0-9|$.%]*(?<price>[0-9]+.*[0-9]*)\\$$");
        double totalSum = 0;
        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentTotalPrice = price * count;
                System.out.printf("%s: %s - %.2f%n", customer, product, currentTotalPrice);
                totalSum += currentTotalPrice;
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
