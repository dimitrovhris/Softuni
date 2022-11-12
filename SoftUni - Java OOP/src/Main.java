import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(numbers, urls);
        callAllNumbers(smartphone);
        browseAllSites(smartphone);
    }
    private static void callAllNumbers(Smartphone smartphone){
        for(String number: smartphone.getNumbers()){
            if(currentNumberIsValid(number)){
                System.out.println(smartphone.call() + number);
            } else{
                System.out.println("Invalid number!");
            }
        }
    }
    private static void browseAllSites(Smartphone smartphone){
        for(String url: smartphone.getUrls()){
            if(currentURLIsValid(url)){
                System.out.println(smartphone.browse() + url + "!");
            } else{
                System.out.println("Invalid URL!");
            }
        }
    }
    private static boolean currentNumberIsValid (String number){
        for(int i = 0; i < number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static boolean currentURLIsValid(String url){
        for(int i = 0; i < url.length(); i++){
            if(Character.isDigit(url.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
