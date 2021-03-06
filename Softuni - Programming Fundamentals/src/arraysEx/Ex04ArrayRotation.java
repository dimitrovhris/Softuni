package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            int begin = array[0];

            for(int j = 0; j <= array.length-2;j++){
                array[j] = array[j+1];
            }
            array[array.length-1] = begin;
        }
        for(int item: array){
            System.out.printf("%d ", item);
        }
    }
}
