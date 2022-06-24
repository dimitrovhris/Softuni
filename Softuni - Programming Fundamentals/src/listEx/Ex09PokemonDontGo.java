package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex09PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int totalSum = 0;
        while (!input.isEmpty()) {
            int currentIndex = Integer.parseInt(sc.nextLine());
            int removedElement;
            if (currentIndex < 0) {
                removedElement = input.get(0);
                input.remove(0);
                input.add(0, input.get(input.size()-1));
            } else if (currentIndex > input.size() - 1) {
                removedElement = input.get(input.size() - 1);
                input.remove(input.size()-1);
                input.add(input.get(0));
            } else {
                removedElement = input.get(currentIndex);
                input.remove(currentIndex);
            }
            totalSum += removedElement;
            for (int i = 0; i <= input.size() - 1; i++) {
                if (input.get(i) <= removedElement) {
                    input.set(i, input.get(i) + removedElement);
                } else {
                    input.set(i, input.get(i) - removedElement);
                }
            }
        }
        System.out.println(totalSum);
    }
}
