package generics.jarOfT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jar<Integer> jar = new Jar<>();

        jar.add(13);
        System.out.println(jar.remove());
    }
}
