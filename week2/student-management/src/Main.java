import exception.InvalidStudentException;
import model.Student;
import model.StudentStatus;
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
                "Software Development",
                StudentStatus.ACTIVE
        );

        Student student2 = new Student(
                102,
                "Flora",
                "flora@example.com",
                "Embedded Systems",
                StudentStatus.ACTIVE
        );

        Student student3 = new Student(
                103,
                "Liam",
                "liam@example.com",
                "Computer Science",
                StudentStatus.GRADUATED
        );

        studentRepository.add(student1);
        studentRepository.add(student2);
        studentRepository.add(student3);

        System.out.println("\nAll Students:");

        for (Student student : studentRepository.findAll()) {
            student.display();
        }

        System.out.println("\nTesting invalid student data:");

        try {

            Student invalidStudent = new Student(
                    104,
                    "",
                    "invalid-email",
                    "Software Development",
                    StudentStatus.ACTIVE
            );

            studentRepository.add(invalidStudent);

        } catch (InvalidStudentException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        System.out.println("\nProject is still running normally.");
    }
}