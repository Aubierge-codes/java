public class Objects {

    public static void main(String[] args) {

        Student student1 = new Student("Aubierge", 16, "High School");
        Student student2 = new Student("Flora", 17, "High School");
        Student student3 = new Student("Liam", 18, "University");

        student1.introduce();
        student2.introduce();
        student3.introduce();
    }
}

class Student {

    String name;
    int age;
    String school;

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    void introduce() {
        System.out.println(
            "My name is " + this.name +
            ", I am " + this.age +
            " years old, and I study at " + this.school + "."
        );
    }
}