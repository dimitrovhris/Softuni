package genericsEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Box<Double> box = new Box<>();
        while(n -- > 0){
            double element = Double.parseDouble(sc.nextLine());
            box.add(element);
        }
        double compareValue = Double.parseDouble(sc.nextLine());
        System.out.println(box.countStrings(box.getList(), compareValue));
    }
}