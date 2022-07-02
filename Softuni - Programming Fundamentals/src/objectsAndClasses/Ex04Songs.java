package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04Songs {
    static class Song{
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return this.typeList;
        }
        public void setTypeList(String typeList){
            this.typeList = typeList;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getTime(){
            return this.time;
        }
        public void setTime(String time){
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Song> songs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] data = sc.nextLine().split("_");
            Song currentSong = new Song();
            currentSong.setTypeList(data[0]);
            currentSong.setName(data[1]);
            currentSong.setTime(data[2]);
            songs.add(currentSong);
        }
        String typeList = sc.nextLine();
        if(typeList.equals("all")){
            for(Song song: songs){
                System.out.println(song.getName());
            }
        }
        else{
            for(Song song: songs){
                if(typeList.equals(song.getTypeList())){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
