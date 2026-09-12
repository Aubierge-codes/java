import java.util.HashMap;

public class StudentMap {

    public static void main(String[] args) {

        HashMap<Integer, Student> students = new HashMap<>();

        students.put(101, new Student("Aubierge", 16));
        students.put(102, new Student("Flora", 17));
        students.put(103, new Student("Liam", 18));

        System.out.println("All students:");

        for (Student student : students.values()) {
            student.introduce();
        }

        System.out.println("\nSearching for student ID 102:");

        Student foundStudent = students.get(102);

        if (foundStudent != null) {
            foundStudent.introduce();
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nUpdating student 102:");

        students.put(102, new Student("Flora", 18));

        students.get(102).introduce();

        System.out.println("\nTotal students: " + students.size());
    }
}

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println(
            "Name: " + name + ", Age: " + age
        );
    }
}