import java.util.ArrayList;
import java.util.Collections;

public class ComparableStudents {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Liam", 18));
        students.add(new Student("Aubierge", 16));
        students.add(new Student("Flora", 17));

        System.out.println("Before sorting:");

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by age:");

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}

class Student implements Comparable<Student> {

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

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}