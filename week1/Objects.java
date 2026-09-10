public class Objects {

    public static void main(String[] args) {

        Student student1 = new Student("Aubierge", 16);
        Student student2 = new Student("Flora", 17);

        student1.introduce();
        student2.introduce();
    }
}

class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}