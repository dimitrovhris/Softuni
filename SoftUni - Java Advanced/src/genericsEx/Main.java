package genericsEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Box<Integer> box = new Box<>();
        while(n -- > 0){
            int element = Integer.parseInt(sc.nextLine());
            box.add(element);
        }
        String[] indexes = sc.nextLine().split(" ");
        int index1 = Integer.parseInt(indexes[0]);
        int index2 = Integer.parseInt(indexes[1]);
        box.swap(index1, index2);
        System.out.println(box);
    }
}