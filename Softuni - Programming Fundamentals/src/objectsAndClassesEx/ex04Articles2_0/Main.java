package objectsAndClassesEx.ex04Articles2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Article> articles = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] articleData = sc.nextLine().split(", ");
            Article article = new Article(articleData[0], articleData[1], articleData[2]);
            articles.add(article);
        }
        String input = sc.nextLine();
        for(Article item: articles){
            System.out.println(item);
        }
    }
}
