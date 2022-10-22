package exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstArr = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> milligrams = new ArrayDeque<>();
        ArrayDeque<Integer> drinks = new ArrayDeque<>();
        Arrays.stream(firstArr).forEach(milligrams::push);
        Arrays.stream(secondArr).forEach(drinks::offer);
        int currentCaffeine = 0;
        while(!milligrams.isEmpty() && !drinks.isEmpty()){
            int currentSum = milligrams.pop() * drinks.peek();
            if(currentSum + currentCaffeine <= 300){
                currentCaffeine += currentSum;
                drinks.poll();
            } else{
                drinks.offer(drinks.poll());
                currentCaffeine -= 30;
                if(currentCaffeine < 0){
                    currentCaffeine = 0;
                }
            }
        }
        if(!drinks.isEmpty()){
            System.out.print("Drinks left: ");
            int iter = drinks.size()-1;
            for(int i = 0; i < iter; i++){
                System.out.printf("%d, ", drinks.poll());
            }
            System.out.printf("%d ", drinks.poll());
            System.out.println();
        } else{
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", currentCaffeine);
    }
}
