package methodsEx;

import java.util.Scanner;

public class Ex07NxNMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        matrix(n);
    }
    public static void matrix (int num){
        for (int i = 1; i <= num; i++) {
            System.out.println(printOnLine(num));
        }
    }
    public static String printOnLine(int num) {
        String line = "";
        for (int i = 1; i <= num; i++) {
            line += num + " ";
        }
        return line;

    }
}
