package objectsAndClassesEx;

import java.util.Random;
import java.util.Scanner;

public class Ex01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [] phrases = new String[]{"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};

        String [] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] women = new String[]{"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();
        for(int i = 1; i <= n; i++){
            String phrase = phrases[rnd.nextInt(phrases.length)];
            String event = events[rnd.nextInt(events.length)];
            String woman = women[rnd.nextInt(women.length)];
            String city = cities[rnd.nextInt(cities.length)];
            System.out.printf("%s %s %s - %s%n", phrase, event, woman, city);
        }
    }
}
