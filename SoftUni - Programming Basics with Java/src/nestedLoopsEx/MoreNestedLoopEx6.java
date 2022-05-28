package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lastSector = sc.nextLine().charAt(0);
        int rowsCount = Integer.parseInt(sc.nextLine());
        int oddRowSeats = Integer.parseInt(sc.nextLine());
        int counter = 0;
        for(int i = 'A'; i <= (int) lastSector; i++){
            for(int j = 1; j <= rowsCount; j++) {
                int oddRows = 0;
                int evenRows = 0;
                if(j % 2 == 1){
                    oddRows++;
                }
                else{
                    evenRows++;
                }
                for(int k = 'a'; k <= 96 + (oddRows * oddRowSeats + evenRows * (oddRowSeats + 2)); k++){
                    System.out.printf("%c%d%c%n", (char)i, j, (char)k);
                    counter++;
                }
            }
            rowsCount++;
        }
        System.out.print(counter);
    }
}
