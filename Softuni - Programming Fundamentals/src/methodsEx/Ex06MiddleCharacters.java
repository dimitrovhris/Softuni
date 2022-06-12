package methodsEx;

import java.io.OutputStream;
import java.util.Scanner;

public class Ex06MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(middleCharacters(inputString));
    }
    public static String middleCharacters (String string){
        String output;
        if(string.length() % 2 == 1){
            output = "" + string.charAt(string.length() / 2 );
        }
        else{
            output ="" +  string.charAt(string.length() / 2 -1)+  "" + string.charAt(string.length() / 2);
        }
        return output;
    }
}
