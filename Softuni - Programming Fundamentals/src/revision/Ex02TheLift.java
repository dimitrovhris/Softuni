package revision;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02TheLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int[] wagons = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean outOfPeople = false;
        for(int i = 0; i <= wagons.length-1; i++){
           int freeSeats = 4 - wagons[i];
           for(int j = freeSeats; j >= 1; j--){
               people--;
               wagons[i]++;
               if(people <= 0){
                   outOfPeople = true;
                   System.out.println("The lift has empty spots!");
                   break;
               }
           }
            if(outOfPeople){
                break;
            }
        }
        if(people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        for(int wagon: wagons){
            System.out.printf("%d ", wagon);
        }
    }
}
