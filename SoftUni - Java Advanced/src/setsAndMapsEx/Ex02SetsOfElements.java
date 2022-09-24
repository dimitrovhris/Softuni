package setsAndMapsEx;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for(int i = 1; i <= Integer.parseInt(data[0]); i++){
            set1.add(Integer.parseInt(sc.nextLine()));
        }
        for(int i = 1; i <= Integer.parseInt(data[1]); i++){
            set2.add(Integer.parseInt(sc.nextLine()));
        }
        for(int num: set1){
            if(set2.contains(num)){
                System.out.printf("%d ", num);
            }
        }
    }
}
