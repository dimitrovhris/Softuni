package methodsEx;
import java.util.Scanner;

public class Ex04PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputPassword = sc.nextLine().toLowerCase();
        boolean rule3 = checkIfPasswordHas6To10Characters(inputPassword);
        boolean rule1 = checkIfPasswordContainsOnlyLettersAndDigits(inputPassword);
        boolean rule2 = checkIfPasswordHasAtLeast2Digits(inputPassword);

        if(rule1 && rule2 && rule3){
            System.out.println("Password is valid");
        }
    }
    public static boolean checkIfPasswordHas6To10Characters(String password){
        boolean isValid = false;
        if(password.length() >= 6 && password.length() <= 10){
            isValid = true;
        }
        else{
            System.out.println("Password must be between 6 and 10 characters");
        }
        return isValid;
    }
    public static boolean checkIfPasswordContainsOnlyLettersAndDigits(String password){
        boolean isValid = false;
        for(int i = 0; i <= password.length()-1; i++){
            if((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 97 && password.charAt(i) <= 122)){
                isValid = true;
            }
            else{
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        }
        return isValid;
    }
    public static boolean checkIfPasswordHasAtLeast2Digits(String password){
        boolean isValid = false;
        int counter = 0;
        for (int i = 0; i <= password.length()-1; i++) {
            if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                counter++;
            }
        }
        if(counter >= 2){
            isValid = true;
        }
        else{
            System.out.println("Password must have at least 2 digits");
        }
        return isValid;
    }
}
