package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = sc.nextLine();
        while(!command.equals("end")){
            if(command.charAt(0) == 's') {
                int index1 = Integer.parseInt("" + command.charAt(command.length() - 3));
                int index2 = Integer.parseInt("" + command.charAt(command.length() - 1));
                int secondNum = array[index1];
                array[index1] = array[index2];
                array[index2] = secondNum;
            }
            else if(command.charAt(0) == 'm'){
                int index1 = Integer.parseInt("" + command.charAt(command.length() - 3));
                int index2 = Integer.parseInt("" + command.charAt(command.length() - 1));
                array[index1] = array[index1] * array[index2];
            }
            else{
                for(int i = 0; i<= array.length-1; i++){
                    array[i] = array[i] - 1;
                }
            }
            command = sc.nextLine();
        }
        for(int i = 0; i <= array.length-1; i++){
            if(i < array.length-1){
                System.out.printf("%d, ", array[i]);
            }
            else{
                System.out.printf("%d ", array[i]);
            }
        }
    }
}
