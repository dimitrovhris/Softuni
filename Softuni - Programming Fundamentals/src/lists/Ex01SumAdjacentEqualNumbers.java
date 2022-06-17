package lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());
        for(int i = 0; i <= numbers.size()- 2; i++){
            double num1 = numbers.get(i);
            double num2 = numbers.get(i + 1);
            double sum = num1 + num2;
            if(num1 == num2){
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;

            }
        }
        System.out.println(joinElementsByDelimiter(numbers, " "));
    }
    public static String joinElementsByDelimiter(List<Double> list, String delimiter){
        String result = "";
        for(double item: list){
            DecimalFormat df = new DecimalFormat("0.#");
            result += df.format(item) + delimiter;
        }
        return result;
    }
}

