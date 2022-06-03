package arraysEx;

import java.util.Scanner;

public class Ex01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        int totalSum = 0;
        for(int i = 0; i <= n-1; i++){
            int item = Integer.parseInt(sc.nextLine());
            totalSum+=item;
            array[i] = item;
        }
        for(int item: array){
            System.out.printf("%d ", item);
        }
        System.out.println();
        System.out.println(totalSum);
    }
}
