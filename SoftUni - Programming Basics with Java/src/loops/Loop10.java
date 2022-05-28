package loops;
import java.util.Scanner;
public class Loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1; i<= n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if(i % 2 == 0){
                evenSum += currentNum;
            }
            else{
                oddSum += currentNum;
            }
        }
        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        }
        else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(oddSum - evenSum));
        }
    }
}
