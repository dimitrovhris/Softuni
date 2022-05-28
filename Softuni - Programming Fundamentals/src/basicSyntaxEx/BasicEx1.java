package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String typeOfAge = "";
        if(age <= 2){
            typeOfAge = "baby";
        }
        else if(age <= 13){
            typeOfAge = "child";
        }
        else if(age <= 19){
            typeOfAge = "teenager";
        }
        else if(age <= 65){
            typeOfAge = "adult";
        }
        else{
            typeOfAge = "elder";
        }
        System.out.println(typeOfAge);
    }
}
