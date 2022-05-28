package whileLoopsEx;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favBook = sc.nextLine();
        String inputBook = "";
        int checkedBooks = 0;

        while (!inputBook.equals(favBook) && !inputBook.equals("No More Books")) {
            inputBook = sc.nextLine();
            if(!inputBook.equals("No More Books")){
                checkedBooks++;
            }
        }
        if(inputBook.equals("No More Books")){
            System.out.println("The book you search is not here!\nYou checked " + checkedBooks + " books.");
        }
        else{
            System.out.println("You checked "+ (checkedBooks-1) + " books and found it.");
        }
    }
}