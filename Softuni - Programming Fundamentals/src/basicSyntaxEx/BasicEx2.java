package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean divisible = true;
        int maxDivision = 0;
        if(n % 2 == 0){
            maxDivision = 2;
            if(n % 3 == 0){
                maxDivision = 6;
            }
            if(n % 5 == 0){
                maxDivision = 10;
            }
        }
        else if(n % 3 == 0){
            maxDivision = 3;
        }
        else if(n % 7 == 0){
            maxDivision = 7;
        }
        else{
            divisible = false;
        }
        if(divisible){
        System.out.printf("The number is divisible by %d", maxDivision);
        }
        else{
            System.out.print("Not divisible");
        }
    }
}
