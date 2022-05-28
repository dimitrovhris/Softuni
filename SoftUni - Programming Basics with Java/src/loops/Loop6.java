package loops;
import java.util.Scanner;
public class Loop6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String actorName = sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int judges = Integer.parseInt(sc.nextLine());
        double totalPoints = academyPoints;
        for(int i = 1; i <= judges; i++){
            String judgeName = sc.nextLine();
            double pointsFromJudge= Double.parseDouble(sc.nextLine());
            double pointsNow = judgeName.length() * pointsFromJudge / 2;
            totalPoints += pointsNow;
            if(totalPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }
        double morePoints = Math.abs(totalPoints - 1250.5);
        if(totalPoints <= 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",actorName, morePoints);
        }
    }
}
