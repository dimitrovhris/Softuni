package setsAndMapsEx;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex03PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> elements = new TreeSet<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String[] currentRow = sc.nextLine().split(" ");
            Collections.addAll(elements, currentRow);
        }
        for(String element: elements){
            System.out.printf("%s ", element);
        }
    }
}
