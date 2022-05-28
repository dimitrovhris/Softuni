package conditionalStatements;
import java.util.Scanner;
public class Conditional5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int number = readData.nextInt();

        if (number < 100){
            System.out.println("Less than 100");
        }
        else if (number>= 100 & number <= 200){
            System.out.println("Between 100 and 200");
        }
        else{
            System.out.println("Greater than 200");
        }

    }
}
