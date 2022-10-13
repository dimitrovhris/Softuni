package generics.listUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2 , 3, 4);
        System.out.println(ListUtilities.getMin(integers));
        System.out.println(ListUtilities.getMax(integers));
    }
}
