package objectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06Students2_0 {
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Student> studentList = new ArrayList<>();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            String age = data[2];
            String town = data[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentList.removeIf(e-> e.getFirstName().equals(firstName) && e.getLastName().equals(lastName));
            studentList.add(currentStudent);
            input = sc.nextLine();
        }
        String givenTown = sc.nextLine();
        for(Student student: studentList){
            if(student.getTown().equals(givenTown)){
                System.out.printf("%s %s is %s years old%n",
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge());
            }
        }
    }
}
