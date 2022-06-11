package methods;

import java.util.Scanner;

public class Ex10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInput = Math.abs(Integer.parseInt(sc.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(nInput));
    }
    public static int getMultipleOfEvensAndOdds (int n){
        int sumEven = getEvenSum(n);
        int sumOdd = getOddSum(n);
        int total = sumEven * sumOdd;
        return total;
    }
    public static int getEvenSum(int n){
        int sumEven = 0;
        for(int i = 0; i <= ("" + n).length() - 1; i++){
            if(("" + n).charAt(i) % 2 == 0){
                sumEven += Integer.parseInt("" + ("" + n).charAt(i));
            }
        }
        return sumEven;
    }
    public static int getOddSum(int n){
        int sumOdd = 0;
        for(int i = 0; i <= ("" + n).length() - 1; i++){
            if(("" + n).charAt(i) % 2 == 1){
                sumOdd += Integer.parseInt("" + ("" + n).charAt(i));
            }
        }
        return sumOdd;
    }
}
