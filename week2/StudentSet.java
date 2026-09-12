import java.util.HashSet;

public class StudentSet {

    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Aubierge");
        students.add("Flora");
        students.add("Liam");
        students.add("Aubierge");

        System.out.println("Students:");
        System.out.println(students);

        System.out.println("\nNumber of students: " + students.size());

        System.out.println(
            "Contains Flora? " + students.contains("Flora")
        );

        students.remove("Liam");

        System.out.println("\nAfter removing Liam:");
        System.out.println(students);
    }
}