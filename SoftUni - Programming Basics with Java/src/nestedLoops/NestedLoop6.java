package nestedLoops;

import java.util.Scanner;

public class NestedLoop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFloors = Integer.parseInt(sc.nextLine());
        int roomsOnFloor = Integer.parseInt(sc.nextLine());
        for (int floor = totalFloors; floor > 0; floor--){
            for(int room = 0; room < roomsOnFloor; room++){
                if(floor == totalFloors){
                    System.out.printf("L%d%d ", floor, room);
                }
                else{
                    if(floor % 2 == 0){
                        System.out.printf("O%d%d ", floor, room);
                    }
                    else{
                        System.out.printf("A%d%d ", floor, room);
                    }
                }

            }
            System.out.println();
        }
    }
}
