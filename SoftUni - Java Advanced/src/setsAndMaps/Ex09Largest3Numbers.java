package setsAndMaps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex09Largest3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        if(sorted.size() < 3){
            for(int num: sorted){
                System.out.printf("%d ", num);
            }
        } else{
            for(int i = 0; i < 3; i++){
                System.out.printf("%d ", sorted.get(i));
            }
        }
    }
}
