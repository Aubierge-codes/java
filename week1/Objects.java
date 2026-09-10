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

class Student {

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

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    void introduce() {
        System.out.println(
            "My name is " + name +
            ", I am " + age +
            " years old, and I study at " + school + "."
        );
    }
}

class CodingStudent extends Student {

    public CodingStudent(String name, int age, String school) {
        super(name, age, school);
    }

    public void code() {
        System.out.println(getName() + " is coding in Java.");
    }
}