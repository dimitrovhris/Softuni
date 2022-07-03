package objectsAndClassesEx.ex02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArticle = sc.nextLine().split(", ");
        Article article = new Article(inputArticle[0], inputArticle[1], inputArticle[2]);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            String command = input.split(": ")[0];
            switch(command){
                case "Edit":
                    article.edit(input.split(": ")[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input.split(": ")[1]);
                    break;
                case "Rename":
                    article.rename(input.split(": ")[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
