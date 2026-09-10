public class Objects {

    public static void main(String[] args) {

        Student student1 = new Student("Aubierge", 16, "High School");

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSchool());

        student1.setAge(17);

        System.out.println("Updated age: " + student1.getAge());
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