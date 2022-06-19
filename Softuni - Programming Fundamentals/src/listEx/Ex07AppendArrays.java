package listEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex07AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrays = sc.nextLine().split("\\|");
        List<String> input = new ArrayList<>();
        for(int k = 0; k <= arrays.length-1; k++){
            input.add(k, arrays[k]);
        }
        String result = "";
        for(int i = input.size()-1; i >= 0; i--){
            String[] currentArrayDigits = input.get(i).split(" ");
            for(int j = 0; j <= currentArrayDigits.length-1; j++){
                if(!currentArrayDigits[j].equals(""))
                    result += currentArrayDigits[j] + " ";
            }
        }
        System.out.println(result);
    }
}
