package generics.genericScale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scale<Integer> scale = new Scale<>(1, 2);
        Scale<String> scale2 = new Scale<>("ac", "c");
        System.out.println(scale.getHeavier());
        System.out.println(scale2.getHeavier());
    }
}
