package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] data = sc.nextLine().split(" ");
        int specialNumber = Integer.parseInt(data[0]);
        int power = Integer.parseInt(data [1]);

        for(int i = 0; i <= numbers.size()-1; i++){
            int currentNum = numbers.get(i);
            if(currentNum == specialNumber){
                for(int j = 1; j <= power; j++){
                    if(i <= numbers.size()-2)
                    numbers.remove(i + 1);
                }
                for(int k = 1; k <= power;k++){
                    if(i > 0)
                    numbers.remove(i - 1);
                    i--;
                }
                numbers.remove((Integer) currentNum);
                i = -1;
            }
        }
        System.out.println(calculateSum(numbers));
    }
    public static int calculateSum(List<Integer> numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
