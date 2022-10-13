package generics.genericArrayCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = ArrayCreator.create(String.class, 10, "1");
        for(String num: array){
            System.out.println(num);
        }
        String[] arr = ArrayCreator.create(5, "none");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
