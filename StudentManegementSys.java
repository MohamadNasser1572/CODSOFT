import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private String grade;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public String getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Name: {" + name + ", Roll Number: " + rollNumber + ", Grade: " + grade+"}";
    }
}
class StudentManagementSystem {
    private ArrayList<Student> students;
    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }
    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
public class StudentManegementSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("Student Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search for Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student roll number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter student grade: ");
                    String grade = sc.nextLine();

                    Student newStudent = new Student(name, rollNumber, grade);
                    system.addStudent(newStudent);
                    System.out.println("Student added successfully!\n");
                    break;

                case 2:
                    System.out.print("\nEnter the roll number of the student to remove: ");
                    int rollToRemove = sc.nextInt();
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully!\n");
                    break;

                case 3:
                    System.out.print("\nEnter the roll number of the student to search: ");
                    int rollToSearch = sc.nextInt();
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null)
                        System.out.println("Student found: " + foundStudent+"\n");
                    else 
                        System.out.println("Student not found.\n");
                    break;

                case 4:
                    System.out.println("\nAll Students:\n");
                    system.displayAllStudents();
                    break;

                case 5:
                    System.out.println("\nExiting Student Management System. Thank you for choosing the Student Manegement System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
