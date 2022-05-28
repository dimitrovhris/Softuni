package conditionalStatements;
import java.util.Scanner;
public class Conditional6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String password = readData.nextLine();

        if(password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
