package listEx;

import java.util.*;

import java.util.stream.Collectors;

public class Ex07AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(numbers);
        System.out.println(numbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
