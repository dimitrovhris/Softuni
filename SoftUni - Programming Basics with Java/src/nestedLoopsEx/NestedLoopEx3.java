package nestedLoopsEx;
import java.util.Scanner;
public class NestedLoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while(!input.equals("stop")){
            int inputNum = Integer.parseInt(input);
            if(inputNum < 0){
                System.out.println("Number is negative.");
            }
            else{
                int dividedNums = 0;
                int intNumbersResult = 0;
                for(int divider = 1; dividedNums <= inputNum; divider++){
                    if(inputNum % divider == 0){
                        intNumbersResult++;
                    }
                    dividedNums++;
                }
                if(intNumbersResult >= 3){
                    nonPrimeSum+=inputNum;
                }
            else {
                primeSum+= inputNum;
                }
            }
            input = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}