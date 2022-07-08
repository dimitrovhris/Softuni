package associativeArraysEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05SoftuniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> registeredCars = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] input = sc.nextLine().split(" ");
            String command = input[0];
            String username = input[1];
            switch (command) {
                case "register":
                    String licencePlateNumber = input[2];
                    if (registeredCars.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licencePlateNumber);
                    } else {
                        registeredCars.put(username, licencePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licencePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!registeredCars.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    }
                    else{
                        registeredCars.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        for(Map.Entry<String, String> entry: registeredCars.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
