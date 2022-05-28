package whileLoops;


import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(sum < num){
            sum+= sc.nextInt();
        }
        System.out.println(sum);
    }
}
