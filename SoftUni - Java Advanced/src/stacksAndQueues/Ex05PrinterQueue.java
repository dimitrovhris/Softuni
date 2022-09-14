package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();
        while(!input.equals("print")){
            if(input.equals("cancel")){
                if(files.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                else{
                    System.out.printf("Canceled %s%n", files.poll());
                }
            }
            else{
                files.offer(input);
            }
            input = sc.nextLine();
        }
        for(String file: files){
            System.out.printf("%s%n", file);
        }
    }
}
