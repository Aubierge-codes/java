import java.util.HashMap;

public class StudentMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Aubierge");
        students.put(2, "Flora");
        students.put(3, "Liam");

        System.out.println(students);

        System.out.println("Student 1: " + students.get(1));

        students.remove(2);

        System.out.println("After removing student 2:");
        System.out.println(students);
    }
}