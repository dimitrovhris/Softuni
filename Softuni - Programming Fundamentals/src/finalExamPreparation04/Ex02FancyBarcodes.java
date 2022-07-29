package finalExamPreparation04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02FancyBarcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            Matcher matcher  = pattern.matcher(input);
            StringBuilder productGroup = new StringBuilder();
            if(matcher.find()){
                boolean noBarcode = true;
                for(int j = 0; j <= input.length()-1; j++){
                    if(Character.isDigit(input.charAt(j))){
                        productGroup.append(input.charAt(j));
                        noBarcode = false;
                    }
                }if(!noBarcode)
                System.out.printf("Product group: %s%n", productGroup);
                else{
                    System.out.println("Product group: 00");
                }
            }
            else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
