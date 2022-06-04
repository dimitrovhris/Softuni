package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for(int i = 0; i<= arr.length-2; i++){
            boolean yes = false;
            for(int j = i+1; j <= arr.length-1; j++){
                if(arr[i] > arr[j]){
                    yes = true;
                }
                else{
                    yes = false;
                    break;
                }
            }
            if(yes){
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.printf("%d", arr[arr.length-1]);
    }
}
