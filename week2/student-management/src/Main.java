import model.Student;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        Student student1 = new Student(
                101,
                "Aubierge",
                "aubierge@example.com",
                "Software Development"
        );

        Student student2 = new Student(
                102,
                "Flora",
                "flora@example.com",
                "Embedded Systems"
        );

        System.out.println("\nRegistered Students:");

        student1.display();
        student2.display();
    }
}