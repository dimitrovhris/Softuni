package associativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class Ex01CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        TreeMap<Double, Integer> counts = new TreeMap<>();
        for(double num: nums){
            if(counts.containsKey(num)){
                counts.put(num, counts.get(num) + 1);
            }
            else{
                counts.put(num, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
