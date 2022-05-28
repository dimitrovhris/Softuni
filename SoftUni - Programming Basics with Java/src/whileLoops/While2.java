package whileLoops;
import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String inputPassword = sc.nextLine();

        while(!inputPassword.equals(password)){
            inputPassword = sc.nextLine();
        }
        if (inputPassword.equals(password)){
            System.out.println("Welcome " + username + "!");
        }
    }
}
