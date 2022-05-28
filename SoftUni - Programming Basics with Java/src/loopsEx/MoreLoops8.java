package loopsEx;
import java.util.Scanner;
public class MoreLoops8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int notEquals = 0;
        int maxDiff = Integer.MIN_VALUE;
        for(int i = 1; i <= n-1; i++){
            int sumNow = a+b;
            a = Integer.parseInt(sc.nextLine());
            b = Integer.parseInt(sc.nextLine());
            int sumNow1 = a + b;
            if(sumNow != sumNow1){
                notEquals++;
                int diffNow = Math.abs(sumNow - sumNow1);
                if(diffNow > maxDiff) {
                    maxDiff = diffNow;
                }
            }
        }
        if(notEquals == 0){
            System.out.printf("Yes, value=%d", a+b);
        }
        else{
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
