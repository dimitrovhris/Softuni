package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxLength = Integer.MIN_VALUE;
        int maxNum = 0;
        for(int i = 0; i <= array.length-2; i++){
            int lengthNow = 1;
            for(int j = i+1; j <= array.length-1; j++){
                if(array[i] == array[j]){
                    lengthNow++;
                }
                else{
                    break;
                }
            }
            if(lengthNow > maxLength){
                maxNum = array[i];
                maxLength = lengthNow;
            }
        }
        for(int i = 1; i <= maxLength; i++){
            System.out.printf("%d ", maxNum);
        }
    }
}
