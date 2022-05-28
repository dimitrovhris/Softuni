package nestedConditional;
import java.util.Scanner;
public class Nested7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int number = Integer.parseInt(readData.nextLine());

        boolean valid = (number >= 100 && number <= 200) || (number == 0);
        if (!valid){ //ако valid е false:
            System.out.println("invalid");
        }
    }
}
