package objectsAndClasses;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;
public class Ex01RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        Random random = new Random();
        while (!words.isEmpty()){
            int randomIndex = random.nextInt(words.size());
            System.out.println(words.get(randomIndex));
            words.remove(randomIndex);
        }
    }
}
