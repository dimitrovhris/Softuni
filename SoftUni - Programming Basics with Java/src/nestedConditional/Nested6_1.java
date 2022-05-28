package nestedConditional;

import java.util.Scanner;

public class Nested6_1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String product = readData.nextLine();
        switch (product) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
