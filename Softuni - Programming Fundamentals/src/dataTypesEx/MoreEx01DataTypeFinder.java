package dataTypesEx;

import java.util.Scanner;

public class MoreEx01DataTypeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("END")) {
            String dataType = "string";
            boolean num = false;
            if ((input.charAt(0) >= 48 && input.charAt(0) <= 57) || (input.length() > 1 && input.charAt(1) >= 48 && input.charAt(1) <= 57)) {
                num = true;
                for (int i = 0; i <= input.length() - 1; i++) {
                    if (input.charAt(i) == '.') {
                        if (i != 0 && i != input.length() - 1)
                            dataType = "floating point";
                        break;
                    } else {
                        dataType = "integer";
                    }
                }
            } else if (input.length() == 1) {
                dataType = "character";
            }
            else if (input.equals("true") || input.equals("false")) {
                dataType = "boolean";
            }
            else{
                dataType = "string";
            }
            System.out.printf("%s is %s type%n", input, dataType);
            input = sc.nextLine();
        }
    }
}
