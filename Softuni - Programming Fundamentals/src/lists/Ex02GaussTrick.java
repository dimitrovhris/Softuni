package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for(int i = 0; i <= numbers.size() / 2; i++){
            int sum = numbers.get(i) + numbers.get(numbers.size()-1);
            numbers.set(i, sum);
            numbers.remove(numbers.size()-1);
        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
