package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex04ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("End")) {
            switch (input.split(" ")[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(input.split(" ")[1]);
                    nums.add(numToAdd);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(input.split(" ")[1]);
                    int indexToInsert = Integer.parseInt(input.split(" ")[2]);
                    if (indexToInsert < 0 || indexToInsert >= nums.size()) {
                        System.out.println("Invalid index");
                    } else {
                        nums.add(indexToInsert, numToInsert);
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(input.split(" ")[1]);
                    if (indexToRemove < 0 || indexToRemove >= nums.size()) {
                        System.out.println("Invalid index");
                    } else {
                        nums.remove(indexToRemove);
                    }
                    break;
                case "Shift":
                    switch (input.split(" ")[1]) {
                        case "left":
                            int countLeft = Integer.parseInt(input.split(" ")[2]);
                            for (int i = 1; i <= countLeft; i++) {
                                nums.add(nums.get(0));
                                nums.remove(0);
                            }
                            break;
                        case "right":
                            int countRight = Integer.parseInt(input.split(" ")[2]);
                            for(int i = 1; i <= countRight; i++) {
                                nums.add(0, nums.get(nums.size()-1));
                                nums.remove(nums.size()-1);
                        }
                            break;
                    }
                    break;
            }
            input = sc.nextLine();
        }
        for(int item : nums){
            System.out.printf("%d ", item);
        }
    }
}
