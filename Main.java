import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;
    String course;

    int mathsMarks;
    int javaMarks;
    int dbmsMarks;

    double gpa;

    Student(int id,
            String name,
            int age,
            String course,
            int mathsMarks,
            int javaMarks,
            int dbmsMarks) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;

        this.mathsMarks = mathsMarks;
        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;

        double average =
                (mathsMarks + javaMarks + dbmsMarks) / 3.0;

        this.gpa = average / 10.0;
    }

    void display() {

        System.out.println(
                "ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Course: " + course +
                " | Maths: " + mathsMarks +
                " | Java: " + javaMarks +
                " | DBMS: " + dbmsMarks +
                " | GPA: " + String.format("%.2f", gpa));
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== SMART STUDENT PORTAL =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Maths Marks: ");
                    int mathsMarks = sc.nextInt();

                    System.out.print("Enter Java Marks: ");
                    int javaMarks = sc.nextInt();

                    System.out.print("Enter DBMS Marks: ");
                    int dbmsMarks = sc.nextInt();

                    students.add(
                            new Student(
                                    id,
                                    name,
                                    age,
                                    course,
                                    mathsMarks,
                                    javaMarks,
                                    dbmsMarks));

                    System.out.println("Student Added Successfully!");

                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No Students Found");

                    } else {

                        for (Student s : students) {
                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.id == searchId) {

                            System.out.println("Student Found:");
                            s.display();

                            found = true;

                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == deleteId) {

                            students.remove(i);

                            System.out.println(
                                    "Student Deleted Successfully");

                            removed = true;

                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
