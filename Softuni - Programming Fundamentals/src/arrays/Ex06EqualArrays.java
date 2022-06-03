package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean difference = false;
        int[] array1 = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer:: parseInt)
                .toArray();
        int[] array2 = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer:: parseInt)
                .toArray();
        int sum = 0;
        for(int i = 0; i <= array1.length-1; i++){
            if(array1[i] == array2[i]){
                sum+=array1[i];
            }
            else{
                difference = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
        if(!difference){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
