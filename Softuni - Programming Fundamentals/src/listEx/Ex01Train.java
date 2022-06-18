package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("end")){
            if(input.split(" ")[0].equals("Add")){
                int num = Integer.parseInt(input.split(" ")[1]);
                wagons.add(num);
            }
            else{
                int num = Integer.parseInt(input.split(" ")[0]);
                for(int i = 0; i <= wagons.size()-1; i++){
                    if(num <= capacity - wagons.get(i)){
                        wagons.set(i, num + wagons.get(i));
                        break;
                    }
                }
            }
            input = sc.nextLine();
        }
        for(int wagon: wagons){
            System.out.printf("%d ", wagon);
        }
    }
}
