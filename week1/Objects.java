import java.util.ArrayList;

public class Objects {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Aubierge");
        students.add("Flora");
        students.add("Liam");

        System.out.println(students);

        System.out.println("First student: " + students.get(0));

        students.remove("Flora");

        System.out.println("After removal: " + students);
        System.out.println("Number of students: " + students.size());
    }
}