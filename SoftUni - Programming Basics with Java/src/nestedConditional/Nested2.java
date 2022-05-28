package nestedConditional;
import java.util.Scanner;
public class Nested2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
//•	dog -> mammal
//•	crocodile, tortoise, snake -> reptile
//•	others -> unknown
    String animal = readData.nextLine();

    switch (animal){
        case "dog":
            System.out.println("mammal");
            break;
        case "crocodile":
        case "tortoise":
        case "snake":
            System.out.println("reptile");
            break;
        default:
            System.out.println("unknown");
    }
    }
}
