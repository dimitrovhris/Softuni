package setsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex04CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numbers = new LinkedHashMap<>();
        for(double currentNum: nums){
            if(!numbers.containsKey(currentNum)){
                numbers.put(currentNum, 1);
            } else{
                numbers.put(currentNum, numbers.get(currentNum)+ 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
