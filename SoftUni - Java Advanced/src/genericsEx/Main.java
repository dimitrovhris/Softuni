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
        System.out.println(box);
    }
}