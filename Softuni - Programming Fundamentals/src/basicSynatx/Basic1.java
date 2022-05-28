package basicSynatx;

import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
        System.out.println(result);
    }
}
