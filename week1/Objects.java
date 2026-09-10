import java.util.ArrayList;

public class Objects {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(
            new CodingStudent(
                "Aubierge",
                16,
                "Rwanda Coding Academy"
            )
        );

        students.add(
            new CodingStudent(
                "Flora",
                17,
                "High School"
            )
        );

        for (Student student : students) {
            student.introduce();
        }
    }
}

abstract class Student {

    private String name;
    private int age;
    private String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public abstract void introduce();
}

interface Programmer {

    void code();
}

class CodingStudent extends Student implements Programmer {

    public CodingStudent(String name, int age, String school) {
        super(name, age, school);
    }

    @Override
    public void introduce() {
        System.out.println(
            "Coding student: " +
            getName() +
            " - " +
            getSchool()
        );
    }

    @Override
    public void code() {
        System.out.println(getName() + " is coding.");
    }
}