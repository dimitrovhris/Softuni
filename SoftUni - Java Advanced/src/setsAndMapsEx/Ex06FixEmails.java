package setsAndMapsEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = sc.nextLine();
            String[] emailParts = email.split("\\.");
            String domain = emailParts[emailParts.length - 1];
            if (!domain.equalsIgnoreCase("com") && !domain.equalsIgnoreCase("uk")
                    && !domain.equalsIgnoreCase("us")) {
                emails.put(name, email);
            }
            name = sc.nextLine();
        }
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }

    }
}
