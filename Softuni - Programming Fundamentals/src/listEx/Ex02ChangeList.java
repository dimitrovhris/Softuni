package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            switch (input.split(" ")[0]) {
                case "Delete":
                    int numToRemove = Integer.parseInt(input.split(" ")[1]);
                    numbers.removeIf(e -> e == numToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(input.split(" ")[1]);
                    int index = Integer.parseInt(input.split(" ")[2]);
                    numbers.add(index, numToInsert);
                    break;
            }
            input = sc.nextLine();
        }

        for(int item: numbers){
            System.out.printf("%d ", item);
        }
    }
}

