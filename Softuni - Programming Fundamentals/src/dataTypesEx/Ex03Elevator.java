package dataTypesEx;

import java.util.Scanner;

public class Ex03Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());

        int totalCourses = n / p;
        if(n % p != 0){
                totalCourses++;
        }
        System.out.println(totalCourses);
    }
}
