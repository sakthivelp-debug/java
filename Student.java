import java.util.*;
public class Student {
    String name;
    String department;
    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public static void main(String[] args) {
    Student s1 = new Student("Rahul", "Computer Science");

        System.out.println("Name: " + s1.name);
        System.out.println("Department: " + s1.department);
    
    }
}