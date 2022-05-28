package loops;
import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);

        int n = Integer.parseInt(readData.nextLine());

        for (int i = n; i >= 1; i--){
            System.out.println(i);
        }


    }
}
