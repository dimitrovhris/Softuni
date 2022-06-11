package methods;

import java.util.Scanner;

public class Ex09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch(type){
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }
    public static int getMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static char getMax(char char1, char char2){
        if(char1 > char2){
            return char1;
        }
        else{
            return char2;
        }
    }
    public static String getMax(String string1, String string2){
        if(string1.compareTo(string2)> 0){
            return string1;
        }
        else{
            return string2;
        }
    }
}
