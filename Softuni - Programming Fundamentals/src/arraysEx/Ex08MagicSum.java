package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int givenNum = Integer.parseInt(sc.nextLine());

        for(int i = 0; i <= array.length-1; i++){
            for(int j = i+1; j <= array.length-1; j++){
                    if(array[i] + array[j] == givenNum){
                        System.out.printf("%d %d%n", array[i], array[j]);
                }
            }
        }
    }
}
