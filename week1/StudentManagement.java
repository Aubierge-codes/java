import java.util.ArrayList;

public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(
            new CodingStudent(
                "Aubierge",
                "Java"
            )
        );

        students.add(
            new CodingStudent(
                "Flora",
                "Python"
            )
        );

        students.add(
            new DesignStudent(
                "Blaise",
                "UI/UX"
            )
        );

        for (Student student : students) {

            student.introduce();
            student.work();

            System.out.println();
        }
    }
}

abstract class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void work();

    public void introduce() {

        System.out.println(
            "My name is " + name + "."
        );
    }
}

class CodingStudent extends Student {

    private String language;

    public CodingStudent(String name, String language) {

        super(name);
        this.language = language;
    }

    @Override
    public void work() {

        System.out.println(
            getName() + " is coding in " + language + "."
        );
    }
}

class DesignStudent extends Student {

    private String specialization;

    public DesignStudent(
        String name,
        String specialization
    ) {

        super(name);
        this.specialization = specialization;
    }

    @Override
    public void work() {

        System.out.println(
            getName() +
            " is designing " +
            specialization +
            "."
        );
    }
}