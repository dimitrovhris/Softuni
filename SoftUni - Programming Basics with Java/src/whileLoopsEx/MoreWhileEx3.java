package whileLoopsEx;
import java.util.Scanner;
public class MoreWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int secretC = 0;
        int secretO = 0;
        int secretN = 0;
        boolean secretMessage = false;
        String message1 = "";
        String message2 = "";
        while(!input.equals("End")){
            char sign = input.charAt(0);
            int charNumber = (int)sign;
            if((charNumber >= 65 && charNumber <= 90) || (charNumber >= 97 && charNumber <= 122)){
                switch(sign){
                    case 'c' -> secretC++;
                    case 'o' -> secretO++;
                    case 'n' -> secretN++;
                }
                if(secretC == 1 && input.equals("c")){
                    input = "";
                }
                else if(secretN == 1 && input.equals("n")){
                    input = "";
                }
                else if(secretO == 1 && input.equals("o")){
                    input = "";
                }
                if(secretC >= 1 && secretO >= 1 && secretN >= 1){
                    secretMessage = true;
                }
                if(secretMessage){
                    input+=" ";
                    secretMessage = false;
                    secretC = 0;
                    secretN = 0;
                    secretO = 0;
                    message1 = message2;
                }
            }
            else{
                input = "";
            }
            message2 += input;
            input = sc.nextLine();
        }
        System.out.println(message1);
    }
}

