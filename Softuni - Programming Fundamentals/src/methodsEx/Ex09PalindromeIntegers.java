package methodsEx;

import java.util.Scanner;

public class Ex09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("END")){
            int number = Integer.parseInt(input);
            if(checkIfIsPalindrome(number)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
            input = sc.nextLine();
        }

    }
    public static boolean checkIfIsPalindrome(int num){
        String fromLeft = "";
        String fromRight = "";
        for(int i = 0; i <= ("" + num).length()-1; i++){
            fromLeft += ("" + num).charAt(i);
        }
        for (int i = ("" + num).length()-1; i >= 0; i--){
            fromRight += ("" + num).charAt(i);
        }
        if(fromLeft.equals(fromRight)){
            return true;
        }
        else{
            return false;
        }
    }

}
