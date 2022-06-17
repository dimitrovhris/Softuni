package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer:: parseInt).collect(Collectors.toList());
        numbers.removeIf(e -> e < 0);
        if(numbers.isEmpty()){
            System.out.println("empty");
        }
        else{
            Collections.reverse(numbers);
            for(int item : numbers){
                System.out.printf("%d ", item);
            }
        }
        }
    }

