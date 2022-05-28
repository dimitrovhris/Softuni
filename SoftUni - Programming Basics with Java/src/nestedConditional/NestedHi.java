package nestedConditional;
import java.util.Scanner;

public class NestedHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        String day = sc.nextLine();
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
        }
        System.out.println(price);
    }
}
