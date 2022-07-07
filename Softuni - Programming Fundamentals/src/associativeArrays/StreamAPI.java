package associativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //ARRAY MANIPULATING
        int[] nums = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int minNum = Arrays.stream(nums).
                min().
                getAsInt();

        int maxNum = Arrays.stream(nums)
                .max().
                getAsInt(); //orElse!

        int sum = Arrays.stream(nums)
                .sum();
        double average = Arrays.stream(nums)
                .average()
                .getAsDouble();
        int[] filterOdds = Arrays.stream(nums)
                .filter(e -> e % 2 == 0)
                .toArray();


        //LIST MANIPULATING
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int minNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        int maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        int sumNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        double averageNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        //MAP
        int[] numbersMap = Arrays.stream(input.split(" "))
                .mapToInt(e -> Integer.parseInt(e)) // Integer::parseInt
                .toArray();
        String[] words = {"abc", "def", "ghi", "yyy"};
        words = Arrays.stream(words)
                .map(e -> e + "yyy")
                .toArray(String[]::new);

        //FILTER
        String[] wordsToFilter = Arrays.stream(sc.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0) //Филтрираме думите с четна дължина
                .toArray(String[]::new);
    }
}

