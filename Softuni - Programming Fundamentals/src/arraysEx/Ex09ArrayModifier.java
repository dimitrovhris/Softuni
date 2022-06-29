package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] numbers = Arrays.stream(sc.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();
       String input = sc.nextLine();
       while(!input.equals("end")){
           String command = input.split(" ")[0];
           switch(command){
               case "swap":
                   int index1 = Integer.parseInt(input.split(" ")[1]);
                   int num1 = numbers[index1];
                   int index2 = Integer.parseInt(input.split(" ")[2]);
                   numbers[index1] = numbers[index2];
                   numbers[index2] = num1;
                   break;
               case "multiply":
                   int index11 = Integer.parseInt(input.split(" ")[1]);
                   int index22 = Integer.parseInt(input.split(" ")[2]);
                   numbers[index11] = numbers[index11] * numbers[index22];
                   break;
               case "decrease":
                   for(int i = 0; i<= numbers.length-1; i++){
                       numbers[i]--;
                   }
                   break;
           }
           input = sc.nextLine();
       }
       for(int i = 0; i <= numbers.length-1; i++){
           if(i != numbers.length-1){
               System.out.printf("%d, ", numbers[i]);
           }
           else{
               System.out.printf("%d", numbers[i]);
           }
       }
    }
}
