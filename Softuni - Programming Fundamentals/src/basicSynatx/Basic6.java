package basicSynatx;

import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        String language = "";
        switch(country){
            case "England":
            case "USA":
                language = "English";
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                language = "Spanish";
                break;
            default:
                language = "unknown";
                break;
        }
        System.out.println(language);
    }
}
