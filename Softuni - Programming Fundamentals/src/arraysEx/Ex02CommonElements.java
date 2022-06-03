package arraysEx;

import java.util.Scanner;

public class Ex02CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array1 = sc.nextLine().split(" ");
        String[] array2 = sc.nextLine().split(" ");
        int length = Math.min(array1.length, array2.length);

        for(String item : array2){
            for(String item2: array1){
                if(item.equals(item2)){
                    System.out.printf("%s ", item2);
                }
            }
        }
    }
}
