import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private int id;
    private String name;
    private String course;
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public String toString() {
        return "Student ID: " + id + "\n Name: " + name + "\n Course: " + course;
    }
}
public class CollegeManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (choice != 4);
    }
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();
        students.add(new Student(id, name, course));
        System.out.println("Student added successfully!");
    }
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nList of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    private static void searchStudentById() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found: " + student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

