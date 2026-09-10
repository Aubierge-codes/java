import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Aubierge", 16));
        students.add(new Student("Flora", 17));
        students.add(new Student("Liam", 18));

        System.out.println("Number of students: " + students.size());

        System.out.println();

        for (Student student : students) {
            student.introduce();
        }

        System.out.println();

        students.remove(1);

        System.out.println("After removing one student:");

        for (Student student : students) {
            student.introduce();
        }
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
            "My name is " + name + " and I am " + age + " years old."
        );
    }
}