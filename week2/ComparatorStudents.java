import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorStudents {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Liam", 18));
        students.add(new Student("Aubierge", 16));
        students.add(new Student("Flora", 17));

        System.out.println("Before sorting:");

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }

        students.sort(Comparator.comparing(Student::getName));

        System.out.println("\nSorted by name:");

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }

        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("\nSorted by age:");

        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}