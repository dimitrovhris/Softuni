package functionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex01ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        Consumer<String> printer = System.out::println;
        Arrays.stream(names)
                .forEach(printer);
    }
}
