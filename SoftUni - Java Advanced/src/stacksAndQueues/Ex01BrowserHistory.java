package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex01BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String currentURL = null;
        ArrayDeque<String> history = new ArrayDeque<>();
        while (!input.equals("Home")) {
            if(input.equals("back")){
                if(history.isEmpty()){
                    System.out.println("no previous URLs");
                    input = sc.nextLine();
                    continue;
                }
                else{
                    currentURL = history.pop();
                }
            }
            else{
                if(currentURL != null){
                    history.push(currentURL);
                }
                currentURL = input;
            }
            System.out.println(currentURL);
            input = sc.nextLine();
        }
    }
}

