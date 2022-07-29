package finalExamPreparation04;

import java.util.Scanner;

public class Ex01PasswordReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder password = new StringBuilder();
        password.append(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("Done")){
            String command = input.split(" ")[0];
            boolean valid = true;
            switch(command){
                case "TakeOdd":
                    StringBuilder newWord = new StringBuilder();
                    for(int i = 0; i <= password.length()-1; i++){
                        if(i % 2 == 1){
                            newWord.append(password.charAt(i));
                        }
                    }
                    password.setLength(0);
                    password.append(newWord);
                    break;
                case "Cut":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    int length = Integer.parseInt(input.split(" ")[2]);
                    for(int i = 1; i <= length; i++){
                        password.deleteCharAt(index);
                    }
                    break;
                case "Substitute":
                    String substring = input.split(" ")[1];
                    String substitute = input.split(" ")[2];
                    if(password.toString().contains(substring)){
                        String newText = password.toString().replaceAll(substring, substitute);
                        password.setLength(0);
                        password.append(newText);
                    }
                    else{
                        valid = false;
                        System.out.println("Nothing to replace!");
                    }
            }
            if(valid)
            System.out.println(password);
            input = sc.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
