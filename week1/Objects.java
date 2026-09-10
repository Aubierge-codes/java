public class Objects {

    public static void main(String[] args) {

        CodingStudent student = new CodingStudent(
            "Aubierge",
            16,
            "Rwanda Coding Academy"
        );

        student.introduce();
        student.code();
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

    public int getAge() {
        return age;
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
            "I am " + getName() +
            ", a coding student at " + getSchool() + "."
        );
    }

    @Override
    public void code() {
        System.out.println(getName() + " is coding in Java.");
    }
}