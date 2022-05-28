package nestedConditional;
import java.util.Scanner;
public class Nested3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double age = Double.parseDouble(readData.nextLine());
        String gender = readData.nextLine();

        if (age >= 16){
            if (gender.equals("f")){
                System.out.println("Ms.");
            }
            else{
                System.out.println("Mr.");
            }
        }
        else{
            if (gender.equals("f")){
                System.out.println("Miss");
            }
            else{
                System.out.println("Master");
            }
        }

    }
}
