package loops;
import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);

        int n = Integer.parseInt(readData.nextLine());

        for (int i =1; i <= n; i = i + 3){
            System.out.println(i);
        }
    }
}
