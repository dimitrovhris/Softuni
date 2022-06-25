package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex10SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> schedule = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            String lessonTitle = input.split(":")[1];
            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split(":")[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    int currentIndex = schedule.indexOf(lessonTitle);
                    schedule.remove(lessonTitle);
                    if(schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.remove(currentIndex + 1);
                    }
                    break;
                case "Swap":
                    String secondLessonTitle = input.split(":")[2];
                    int firstIndex = schedule.indexOf(lessonTitle);
                    int secondIndex = schedule.indexOf(secondLessonTitle);
                    schedule.set(firstIndex, secondLessonTitle);
                    schedule.set(secondIndex, lessonTitle);
                    if (schedule.contains(lessonTitle + "-Exercise")) {
                        schedule.add(secondIndex + 1, lessonTitle + "-Exercise");
                        schedule.remove(firstIndex);
                    }
                    if (schedule.contains(secondLessonTitle + "-Exercise")) {
                        schedule.add(firstIndex + 1, secondLessonTitle + "-Exercise");
                        schedule.remove(secondIndex);
                    }
                    break;
                case "Exercise":
                    int indexEx = schedule.indexOf(lessonTitle);
                    if(schedule.contains(input.split(":")[1]) && !schedule.contains(lessonTitle + "-Exercise")){
                        schedule.add(indexEx+1, lessonTitle+"-Exercise");
                    }
                    else if(!schedule.contains(lessonTitle)){
                        schedule.add(lessonTitle);
                        schedule.add(lessonTitle + "-Exercise");
                    }
                    break;
            }
            input = sc.nextLine();
        }

            for(String item: schedule){
                System.out.printf("%d.%s%n",schedule.indexOf(item) + 1, item);
        }
    }
}
