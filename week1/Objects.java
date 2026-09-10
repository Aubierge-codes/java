import java.util.HashMap;

public class Objects {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Aubierge");
        students.put(102, "Flora");
        students.put(103, "Liam");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));

        students.put(101, "Aubierge Umurerwa");

        System.out.println("Updated: " + students.get(101));

        students.remove(103);

        System.out.println("Final records: " + students);
    }
}