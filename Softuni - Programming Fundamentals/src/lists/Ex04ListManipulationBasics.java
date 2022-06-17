package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer:: parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while(!input.equals("end")){
            String command = input.split(" ")[0];
            switch(command){
                case "Add":
                    int numAdd = Integer.parseInt(input.split(" ")[1]);
                    numbers.add(numAdd);
                    break;
                case "Remove":
                    int numRemove = Integer.parseInt(input.split(" ")[1]);
                    numbers.remove(Integer.valueOf(numRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(input.split(" ")[1]);
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int numInsert = Integer.parseInt(input.split(" ")[1]);
                    int indexInsert = Integer.parseInt(input.split(" ")[2]);
                    numbers.add(indexInsert, numInsert);
            }
            input = sc.nextLine();
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
