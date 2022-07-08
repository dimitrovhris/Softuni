package associativeArraysEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resource = sc.nextLine();
        HashMap<String, Integer> mine = new LinkedHashMap<>();
        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(sc.nextLine());
            if(!mine.containsKey(resource)){
                mine.put(resource, quantity);
            }
            else{;
                mine.put(resource, mine.get(resource) + quantity);
            }
           resource = sc.nextLine();
        }
        for(Map.Entry<String, Integer> entry: mine.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
