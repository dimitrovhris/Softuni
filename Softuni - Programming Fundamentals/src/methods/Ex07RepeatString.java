package methods;

import java.util.Scanner;

public class Ex07RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        String totalString = repeatStrings(string, n);
        System.out.println(totalString);
    }
    public static String repeatStrings (String string, int n){
        String totalString = "";
        for(int i = 1; i <= n; i++){
            totalString += string;
        }
        return totalString;
    }
}
