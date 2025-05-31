import java.util.Scanner;

class Student {
    int rollNumber;
    String name;

    // Constructor 1: Parameterized
    Student(int roll, String name) {
        this.rollNumber = roll;
        this.name = name;
    }

    // Constructor 2: Default name
    Student(int roll) {
        this.rollNumber = roll;
        this.name = "Unknown";
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number and name: ");
        int r1 = sc.nextInt();
        sc.nextLine(); // consume newline
        String n1 = sc.nextLine();
        Student s1 = new Student(r1, n1);

        System.out.print("Enter roll number (name will be 'Unknown'): ");
        int r2 = sc.nextInt();
        Student s2 = new Student(r2);

        System.out.println("\nStudent 1:");
        s1.display();
        System.out.println("Student 2:");
        s2.display();
    }
}