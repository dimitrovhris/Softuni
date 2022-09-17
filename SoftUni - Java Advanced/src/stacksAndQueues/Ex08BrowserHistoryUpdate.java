package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex08BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String currentURL = null;
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        while (!input.equals("Home")) {
            if (input.equals("forward")) {
                if(forward.isEmpty()){
                    System.out.println("no next URLs");
                    input = sc.nextLine();
                    continue;
                } else{
                    currentURL = forward.poll();
                }
            } else if (input.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = sc.nextLine();
                    continue;
                } else {
                    forward.offer(currentURL);
                    currentURL = history.pop();
                }
            } else {
                forward.clear();
                if (currentURL != null) {
                    history.push(currentURL);
                }
                currentURL = input;
            }
            System.out.println(currentURL);
            input = sc.nextLine();
        }
    }
}
