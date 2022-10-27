package workingWithAbstraction.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point topRight = new Point(data[2], data[3]);
        Point bottomLeft = new Point(data[0], data[1]);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);
        int i = Integer.parseInt(sc.nextLine());
        while(i-- > 0){
            int[] pointData = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Point point = new Point(pointData[0], pointData[1]);
            System.out.println(rectangle.contains(point));
        }
    }
}
