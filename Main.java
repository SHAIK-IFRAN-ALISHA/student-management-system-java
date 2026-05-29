import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println(
                "ID: " + id +
                " | Name: " + name +
                " | Age: " + age +
                " | Course: " + course);
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
            System.out.println("3. Exit");

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

                    students.add(
                            new Student(
                                    id,
                                    name,
                                    age,
                                    course));

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

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
