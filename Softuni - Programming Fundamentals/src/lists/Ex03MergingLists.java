package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int minList = Math.min(list1.size(), list2.size());
        for(int i = 0; i <= minList- 1; i++){
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        if(list1.size() > list2.size()){
            result.addAll(list1.subList(minList, list1.size()));
        }
        else{
            result.addAll(list2.subList(minList, list2.size()));
        }
        for(int item : result){
            System.out.printf("%d ", item);
        }
    }
}
