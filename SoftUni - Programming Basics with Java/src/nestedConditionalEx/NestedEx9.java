package nestedConditionalEx;

import java.util.Scanner;

public class NestedEx9 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int examHour = Integer.parseInt(readData.nextLine());
        int examMinute = Integer.parseInt(readData.nextLine());
        int studentHour = Integer.parseInt(readData.nextLine());
        int studentMinute = Integer.parseInt(readData.nextLine());

        String text1 = "";
        String text2 = "";
        int minutesUpDown = 0;
        boolean moreMinutes = false;
        boolean lessMinutes = false;
        boolean goodMinutes = false;
        boolean endMinutes = false;
        boolean endHours = false;

        int finalMinutes = 0;
        int finalHours = 0;

        //Разлика във времето
        if (examHour == studentHour) {
            if (examMinute > studentMinute) {
                minutesUpDown = examMinute - studentMinute;
                lessMinutes = true;
            } else if (examMinute == studentMinute) {
                minutesUpDown = examMinute - studentMinute;
                goodMinutes = true;
            } else {
                minutesUpDown = studentMinute - examMinute;
                moreMinutes = true;
            }
        } else if (examHour > studentHour) {
            if (examMinute > studentMinute) {
                minutesUpDown = (examHour - studentHour) * 60 + (examMinute - studentMinute);
            } else if (examMinute == studentMinute) {
                minutesUpDown = (examHour - studentHour) * 60;
            } else {
                if (examMinute < 10) {
                    examHour--;
                    examMinute += 60;
                }
                minutesUpDown = (examHour - studentHour) * 60 + (examMinute - studentMinute);
            }
            lessMinutes = true;
        } else {
            if (examMinute > studentMinute) {
                if (studentMinute < 10) {
                    studentHour--;
                    studentMinute += 60;
                }
                minutesUpDown = (studentHour - examHour) * 60 + (studentMinute - examMinute);
            } else if (examMinute == studentMinute) {
                minutesUpDown = (studentHour - examHour) * 60;
            } else {
                minutesUpDown = (studentHour - examHour) * 60 + (studentMinute - examMinute);
            }
            moreMinutes = true;
        }
        if ((lessMinutes && minutesUpDown <= 30) || goodMinutes) {
            text1 = "On time";

        } else if (lessMinutes && minutesUpDown > 30) {
            text1 = "Early";
        } else if (moreMinutes) {
            text1 = "Late";
        }
        if (minutesUpDown / 60 == 0) {
            endMinutes = true;
        } else {
            endHours = true;
            finalHours = minutesUpDown / 60;
            finalMinutes = minutesUpDown % 60;
        }
        if (text1.equals("On time")) {
            if (goodMinutes) {
                System.out.println("On time");
            } else if (minutesUpDown <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", minutesUpDown);
            }
        } else if (text1.equals("Early")) {
            if (endMinutes) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", minutesUpDown);
            } else if (endHours) {
                System.out.println("Early");
                if (finalMinutes < 10) {
                    System.out.printf("%d:0%d hours before the start", finalHours, finalMinutes);
                } else {
                    System.out.printf("%d:%d hours before the start", finalHours, finalMinutes);
                }
            }
        } else if (text1.equals("Late")) {
            if (endMinutes) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", minutesUpDown);
            } else if (endHours) {
                System.out.println("Late");
                if (finalMinutes < 10) {
                    System.out.printf("%d:0%d hours after the start", finalHours, finalMinutes);
                } else {
                    System.out.printf("%d:%d hours after the start", finalHours, finalMinutes);
                }
            }


        }
    }
}