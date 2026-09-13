import java.util.ArrayList;

public class StudentSearch {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aubierge", 16));
        students.add(new Student("Flora", 17));
        students.add(new Student("Liam", 18));

        String searchName = "Flora";

        Student foundStudent = findStudent(students, searchName);

        if (foundStudent != null) {
            System.out.println("Student found:");
            foundStudent.introduce();
        } else {
            System.out.println("Student not found.");
        }

        students.removeIf(student -> student.getAge() < 17);

        System.out.println("\nStudents after removing students younger than 17:");

        for (Student student : students) {
            student.introduce();
        }
    }

    public static Student findStudent(
            ArrayList<Student> students,
            String name) {

        for (Student student : students) {

            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }

        return null;
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println(
                "Name: " + name + ", Age: " + age
        );
    }
}