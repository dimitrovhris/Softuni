package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int totalFactorial = 0;
        for(int i = 0; i <= n.length()-1; i++){
            int currentDigit = Integer.parseInt(""+ n.charAt(i));
            int currentFactorial = 1;
            for(int j = currentDigit; j >= 1; j--){
                currentFactorial *= j;
            }
            totalFactorial += currentFactorial;
        }
        if(Integer.parseInt(n) == totalFactorial){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
