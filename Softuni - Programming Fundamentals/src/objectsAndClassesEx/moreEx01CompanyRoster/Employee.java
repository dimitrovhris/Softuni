package objectsAndClassesEx.moreEx01CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email = "n/a";
    private int age = -1;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}

