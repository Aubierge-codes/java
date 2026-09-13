import model.Student;
import repository.Repository;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     STUDENT MANAGEMENT SYSTEM");
        System.out.println("=================================");

        Repository<Student> studentRepository =
                new Repository<>();

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

        studentRepository.add(student1);
        studentRepository.add(student2);

        System.out.println("\nRegistered Students:");

        for (Student student : studentRepository.findAll()) {
            student.display();
        }

        System.out.println(
                "\nTotal students: "
                + studentRepository.count()
        );

        System.out.println("\nFinding student at index 0:");

        Student foundStudent =
                studentRepository.findByIndex(0);

        if (foundStudent != null) {
            foundStudent.display();
        }

        System.out.println("\nRemoving Flora:");

        studentRepository.remove(student2);

        for (Student student : studentRepository.findAll()) {
            student.display();
        }

        System.out.println(
                "\nTotal students: "
                + studentRepository.count()
        );
    }
}