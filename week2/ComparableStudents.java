import java.util.ArrayList;
import java.util.Collections;

public class ComparableStudents {

    public static void main(String[] args) {

        ArrayList<ComparableStudent> students = new ArrayList<>();

        students.add(new ComparableStudent("Liam", 18));
        students.add(new ComparableStudent("Aubierge", 16));
        students.add(new ComparableStudent("Flora", 17));

        System.out.println("Before sorting:");

        for (ComparableStudent student : students) {
            System.out.println(
                student.getName() + " - " + student.getAge()
            );
        }

        Collections.sort(students);

        System.out.println("\nAfter sorting by age:");

        for (ComparableStudent student : students) {
            System.out.println(
                student.getName() + " - " + student.getAge()
            );
        }
    }
}

class ComparableStudent implements Comparable<ComparableStudent> {

    private String name;
    private int age;

    public ComparableStudent(String name, int age) {
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
    public int compareTo(ComparableStudent other) {
        return Integer.compare(this.age, other.age);
    }
}