package genericsEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Box<String> box = new Box<>();
        while(n -- > 0){
            String element = sc.nextLine();
            box.add(element);
        }
        String compareValue = sc.nextLine();
        System.out.println(box.countStrings(box.getList(), compareValue));
    }
}