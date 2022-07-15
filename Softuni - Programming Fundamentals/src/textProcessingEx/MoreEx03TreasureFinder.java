package textProcessingEx;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class MoreEx03TreasureFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sequence = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = sc.nextLine();

        while(!input.equals("find")){
            StringBuilder currentMessage = new StringBuilder();
            int sequenceNum = 0;
            for(int i = 0; i <= input.length()-1; i++){
                currentMessage.append((char) (input.charAt(i) - sequence[sequenceNum]));
                sequenceNum++;
                if(sequenceNum == sequence.length){
                    sequenceNum = 0;
                }
            }
            String material = currentMessage.substring(currentMessage.indexOf("&") + 1, currentMessage.lastIndexOf("&"));
            String location = currentMessage.substring(currentMessage.indexOf("<") + 1, currentMessage.indexOf(">"));
            System.out.printf("Found %s at %s%n", material, location);
            input = sc.nextLine();
        }
    }
}
