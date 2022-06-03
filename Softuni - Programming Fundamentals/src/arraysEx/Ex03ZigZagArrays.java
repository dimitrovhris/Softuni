package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int adder1;
        int adder2;
        for(int i = 0; i <= n-1; i++){
            if(i % 2 == 0){
                adder1 = 0;
                adder2 = 1;
            }
            else{
                adder1 = 1;
                adder2 = 0;
            }
            int[] arr = Arrays
                    .stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            arr1[i] = arr[adder1];
            arr2[i] = arr[adder2];
        }
        for(int item: arr1){
            System.out.printf("%d ", item);
        }
        System.out.println();
        for(int item: arr2){
            System.out.printf("%d ", item);
        }
    }
}
