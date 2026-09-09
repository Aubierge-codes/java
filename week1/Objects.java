public class Objects {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Aubierge";
        student1.age = 16;
        student1.school = "High School";

        student1.introduce();
    }
}

class Student {

    String name;
    int age;
    String school;
    
    

    void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

}