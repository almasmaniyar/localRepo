package miniprojects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    
                    Student student = new Student(name, age, grade);
                    studentList.add(student);
                    System.out.println("Student added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Student List:");
                    for (Student s : studentList) {
                        System.out.println("Name: " + s.getName());
                        System.out.println("Age: " + s.getAge());
                        System.out.println("Grade: " + s.getGrade());
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}

class Student {
    private String name;
    private int age;
    private int grade;
    
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getGrade() {
        return grade;
    }
}
