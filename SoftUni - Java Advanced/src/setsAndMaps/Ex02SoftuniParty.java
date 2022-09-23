package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex02SoftuniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Set<String> vipList = new TreeSet<>();
        Set<String> regularList = new TreeSet<>();
        while(!input.equals("PARTY")){
            if(Character.isDigit(input.charAt(0))){
                vipList.add(input);
            } else{
                regularList.add(input);
            }
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while(!input.equals("END")){
            vipList.remove(input);
            regularList.remove(input);
            input = sc.nextLine();
        }
        System.out.println(vipList.size() + regularList.size());
        for(String guest: vipList){
            System.out.println(guest);
        }
        for(String guest: regularList){
            System.out.println(guest);
        }
    }
}
